package ThirdAssignment;

import java.util.Scanner;

public class GreaterOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number");
         int a=sc.nextInt();
         System.out.println("Enter the second number");
         int b=sc.nextInt();
         System.out.println("Enter the third number");
         int c=sc.nextInt();
         if(a>=b && a>=c) {
        	 System.out.println(a);
         }
         else if(b>=a && b>=c) {
        	 System.out.println(b);
         }
         else {
        	 System.out.println(c);
         }
	}

}
