package Scope_operators;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the celsius value");
            double value=sc.nextDouble();
            double fehrenheit=(value*9/5)+32;
            System.out.println(fehrenheit+" F");
	}

}
