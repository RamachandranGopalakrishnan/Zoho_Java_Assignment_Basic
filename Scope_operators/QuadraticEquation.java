package Scope_operators;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
          System.out.println("Enter the a value");
          int a=sc.nextInt();
          System.out.println("Enter the a value");
          int b=sc.nextInt();
          System.out.println("Enter the a value");
          int c=sc.nextInt();
          int inside=(b*b)-(4*a*c);
          double x;
          double y;
          if(inside>=0) {
           x=(-b+Math.sqrt(inside))/(2*a);
           y=(-b-Math.sqrt(inside))/(2*a);
          }
          else {
        	   x=(-b)/(2*a);
               y=(-b)/(2*a);
          }
          System.out.println("The Value of X1 is "+x+"and X2 is "+y);
	}

}
