package ClassAndObjects;

public class Employee {
     private String name;
     private int salary;
     private String role;
     private int experience;
     private static int count=0;
     
     Employee(String name,int salary,String role){
    	 this.name=name;
    	 this.salary=salary;
    	 this.role=role;
    	 count++;
     }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public static int getEmployeeCount() {
		return count;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
     
}
