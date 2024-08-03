package Abstarct;

public class HourlyEmployee extends Employee{
	private String name;
	private String role;
	private int totalHour;
	private int hourIncome;
           
	HourlyEmployee(String name,String role,int totalHour,int hourIncome){
		this.name=name;
		this.role=role;
		this.totalHour=totalHour;
		this.hourIncome=hourIncome;
	}
	@Override
	public int calculatePay() {
		return this.hourIncome*this.totalHour;
		
	}

	@Override
	public void printDetails() {
		System.out.println(this.name+" "+this.role+" "+this.hourIncome+" "+this.totalHour);
		
	}



}
