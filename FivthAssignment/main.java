package FivthAssignment;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter the password");
		String password=sc.nextLine();
		if(name==p.getName() && p.getPassword()==p.getPassword()) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
        System.out.print(p.getName()+" "+p.getPassword());
        
        //2 Write a program to calculate Math operations with Math contents initialized in static block.
        
        System.out.println(Math.a+Math.b);
        System.out.println(Math.a-Math.b);
        System.out.println(Math.a*Math.b);
        System.out.println(Math.a/Math.b);
        System.out.println(Math.a%Math.b);
        
	}

}
