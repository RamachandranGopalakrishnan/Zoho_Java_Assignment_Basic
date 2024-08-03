package overriding;

public class SalariedEmployee extends Employee{
     private int salary;
	public SalariedEmployee(String name, String id,int salary) {
		super(name, id);
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    public String toString() {
    	return super.getDeatils()+" "+this.salary;
    }
}
