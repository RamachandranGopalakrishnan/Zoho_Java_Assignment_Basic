package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee hourEmployee=new HourlyEmployee("Ram","1",24,10000);
         System.out.println(hourEmployee.toString());
         Employee salaryEmployee=new SalariedEmployee("Ram","1",1120000000);
         System.out.println(salaryEmployee);
         
         Vehicle bike=new Bike();
         bike.start();
         Car car=new Car();
         car.stop();
         
         Movie goat=new ThrillerMovie("GOAT","Vijay","ACTION");
         System.out.println(goat.printGenre());
         
	}

}
