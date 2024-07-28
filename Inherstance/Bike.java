package Inherstance;

public class Bike extends Vehicle{
	   private String name;
        
	
		public Bike(String fuel, int wheels, String name) {
		super(fuel, wheels);
		this.name = name;
	}

        public String toString() {
    		return "Bike [name=" + name + ", getFuel()=" + getFuel() + ", getWheels()=" + getWheels() + ", toString()="
    				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    	}
        
}
