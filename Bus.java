public class Bus {
    private String busNumber;
    private String startTerminal;
    private String finalTerminal;
    private double ticketPrice;
    private int totalPassengers;

    // Constructor
    Bus(String busNumber, String startTerminal, String finalTerminal, double ticketPrice) {
        this.busNumber = busNumber;
        this.startTerminal = startTerminal;
        this.finalTerminal = finalTerminal;
        this.ticketPrice = ticketPrice;

    }

    public void pickUp(int passenger) {
        this.totalPassengers += passenger;
    }

    // getters
    public String getBusNumber() {
        return busNumber;
    }

    public String getStartTerminal() {
        return startTerminal;
    }

    public String getFinalTerminal() {
        return finalTerminal;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

}
