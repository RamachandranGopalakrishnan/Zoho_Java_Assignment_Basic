package Inherstance;

public class Vehicle {
	private String fuel;
	private int wheels;
	public Vehicle(String fuel, int wheels) {
		super();
		this.fuel = fuel;
		this.wheels = wheels;
	}

	
        public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
        @Override
		public String toString() {
			return "Vehicle [fuel=" + fuel + ", wheels=" + wheels + "]";
		}
		
}
