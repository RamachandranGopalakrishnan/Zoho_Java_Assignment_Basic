package overriding;

public class HourlyEmployee extends Employee{
       private int totalHours;
       private int hourSalary;
	public HourlyEmployee(String name, String id,int totalHours,int hourSalary) {
		super(name, id);
		this.setTotalHours(totalHours);
		this.setHourSalary(hourSalary);
	}
	public int getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	public int getHourSalary() {
		return hourSalary;
	}
	public void setHourSalary(int hourSalary) {
		this.hourSalary = hourSalary;
	}
    public String toString() {
    	return super.getDeatils()+" "+this.hourSalary+" "+this.totalHours+" "+"total-->"+
            this.hourSalary*this.totalHours;
    }
}
