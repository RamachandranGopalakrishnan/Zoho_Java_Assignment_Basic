package Inherstance;

public class ZsgsStudent extends Student{
	       
	private int salary;
	private int incubationDuration;
	
           ZsgsStudent(String name, int age,int salary,int incubationDuration) {
		      super(name, age);
		   this.incubationDuration=incubationDuration;
		   this.salary=salary;
	}
		
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getIncubationDuration() {
			return incubationDuration;
		}
		public void setIncubationDuration(int incubationDuratin) {
			this.incubationDuration = incubationDuration;
		}
		
		public String toString() {
			return this.salary+" "+this.incubationDuration+" "+this.getName()+" "+this.getAge();
			
		}
           
}
