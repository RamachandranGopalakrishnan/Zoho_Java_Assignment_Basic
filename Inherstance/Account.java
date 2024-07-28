package Inherstance;

public class Account {
    private int borrowed;
	private int reserved;
    private int returned;
    private int lost;
    private int fine;
    
    public Account(int borrowed, int reserved, int returned, int lost, int fine) {
		super();
		this.borrowed = borrowed;
		this.reserved = reserved;
		this.returned = returned;
		this.lost = lost;
		this.fine = fine;
	}
	
    public int getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(int borrowed) {
		this.borrowed = borrowed;
	}
	public int getReserved() {
		return reserved;
	}
	public void setReserved(int reserved) {
		this.reserved = reserved;
	}
	public int getReturned() {
		return returned;
	}
	public void setReturned(int returned) {
		this.returned = returned;
	}
	public int getLost() {
		return lost;
	}
	public void setLost(int lost) {
		this.lost = lost;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	 @Override
		public String toString() {
			return "Account [borrowed=" + borrowed + ", reserved=" + reserved + ", returned=" + returned + ", lost=" + lost
					+ ", fine=" + fine + "]";
		}
	 public void calculateFine() {
		 System.out.println("calculating fine");
	 }
    
}
