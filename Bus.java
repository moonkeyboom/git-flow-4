public class Bus {
    private String busNumber;
    private String startTerminal;
    private String finalTerminal;
    private double[] ticketPrices;
    private int totalPassengers;

    // Constructor
    public Bus(String busNumber, String startTerminal, String finalTerminal, double[] ticketPrices) {
        this.busNumber = busNumber;
        this.startTerminal = startTerminal;
        this.finalTerminal = finalTerminal;
        this.ticketPrices = ticketPrices;
        this.totalPassengers = 0;
    }

    public void pickUp(int passenger, Wallet wallet, int startStation, int endStation) {
        double ticketPrice = calculateTicketPrice(startStation, endStation);
        double totalCost = ticketPrice * passenger;

        if (wallet.getAmount() >= totalCost) {
            wallet.purchase(totalCost);
            this.totalPassengers += passenger;
            System.out.println(passenger + " passengers picked up. Total cost: " + totalCost + " THB");
        } else {
            System.out.println("Insufficient funds in wallet for " + passenger + " passengers.");
        }
    }

    private double calculateTicketPrice(int startStation, int endStation) {
        // Assuming ticketPrices array contains prices for each station interval
        int index = Math.abs(endStation - startStation);
        if (index < ticketPrices.length) {
            return ticketPrices[index];
        } else {
            return ticketPrices[ticketPrices.length - 1]; // fallback to the last price if index is out of bounds
        }
    }

    // Getters
    public String getBusNumber() {
        return busNumber;
    }

    public String getStartTerminal() {
        return startTerminal;
    }

    public String getFinalTerminal() {
        return finalTerminal;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }
}

