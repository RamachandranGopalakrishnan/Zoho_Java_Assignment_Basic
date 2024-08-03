package Abstarct;

public  class SalariedEmployee extends Employee{
	private String name;
	private String role;
	private int totalDay;
	private int dayIncome;
	 
	SalariedEmployee(String name,String role,int totalDay,int dayIncome){
		this.setName(name);
		this.setRole(role);
		this.setTotalDay(totalDay);
		this.setDayIncome(dayIncome);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalDay() {
		return totalDay;
	}

	public void setTotalDay(int totalDay) {
		this.totalDay = totalDay;
	}

	public int getDayIncome() {
		return dayIncome;
	}

	public void setDayIncome(int dayIncome) {
		this.dayIncome = dayIncome;
	}
	
	@Override
	public int calculatePay() {
		return this.dayIncome*this.totalDay;
		
	}

	@Override
	public void printDetails() {
		System.out.println(this.name+" "+this.role+" "+this.dayIncome+" "+this.totalDay);
		
	}
	
}
