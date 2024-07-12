package Scope_operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();
        System.out.println("AND "+(a&b));
        System.out.println("OR "+(a|b));
        System.out.println("XOR "+(a^b));
        System.out.println("right shift "+(a>>1));
        System.out.println("unsigned right shift "+(a>>>1));
        System.out.println("left shift "+(a<<b));

	}

}
