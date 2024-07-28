package ClassAndObjects;

public class Flight {
        private String name;
        private int cost;
        private String pioletName;
        private int totalNumberOfSeats;
        private static int totalFlight=0;
        Flight(String name,int cost,String pioletName,int totalNumberOfSeats){
        	this.name=name;
        	this.cost=cost;
        	this.pioletName=pioletName;
        	this.totalNumberOfSeats=totalNumberOfSeats;
        	totalFlight++;
        }
		public static int getTotalFlight() {
			return totalFlight;
		}
		public int getTotalNumberOfSeats() {
			return totalNumberOfSeats;
		}
		public void setTotalNumberOfSeats(int totalNumberOfSeats) {
			this.totalNumberOfSeats = totalNumberOfSeats;
		}
		public String getPioletName() {
			return pioletName;
		}
		public void setPioletName(String pioletName) {
			this.pioletName = pioletName;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
