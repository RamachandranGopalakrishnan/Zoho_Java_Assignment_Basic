package Inherstance;

public class Car extends Vehicle{
     private String name;
	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car(String fuel, int wheels, String name) {
	super(fuel, wheels);
	this.name = name;
}
}
