import java.util.ArrayList;

public class Wallet {
		private double amount;
		private double cumulativePurchase;
		private int point;
		private ArrayList<String> history; // มี package ที่ต้อง import เพิ่ม
					/* นิสิตอาจสร้างคลาสสำหรับประวัติการทำธุรกรรมเพื่อนำมาใข้ได้ */
					/* แต่ถ้า skill ยังไม่ถึง ให้เก็บประสบการณ์ไปก่อน */

		public void topUp(double amount) {
				// เติมเงิน
				this.amount += amount;

				// เก็บประวัติการเติมเงิน (optional)
				history.add("+" + amount);
    }

		public void purchase(double spent) {
				// ตัดเงิน
				amount -= spent;

				// เพิ่มยอดใช้จ่ายสะสม
				cumulativePurchase += spent;

				// คำนวณการสะสมแต้มจากยอดใช้จ่าย
				point += (int) spent / 50;

				// เก็บประวัติการใช้จ่าย (optional)
				history.add("-" + spent);
				history.add("point +" + point);
    }

		public void usePoint(int point) {
				// คำนวณการใช้แต้ม
				this.point -= point;

				// เก็บประวัติการใช้แต้ม (optional)
				history.add("point -" + point);
    }

		// getters
		public double getAmount(){
			return amount;
		}

		public double getCumulativePurchase(){
			return cumulativePurchase;
		}

		public int getPoint(){
			return point;
		}
		
		public ArrayList<String> getHistory(){
			return history;
		}
}