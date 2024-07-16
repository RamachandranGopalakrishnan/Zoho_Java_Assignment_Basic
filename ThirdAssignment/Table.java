package ThirdAssignment;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number");
           int val=sc.nextInt();
           for(int i=1;i<=25;i++) {
        	   System.out.println(i+"X"+val+"="+i*val);
           }
	}

}
