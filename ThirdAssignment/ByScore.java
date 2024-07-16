package ThirdAssignment;

import java.util.Scanner;

public class ByScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the score ");
         int mark=sc.nextInt();
         int grade=mark/10;
         System.out.println(grade);
         
         if(grade>=9) {
             System.out.println("You Got O grade");
         }
         else if(grade>=8) {
        	 System.out.println("You Got A+");
         }
         else if(grade>=7) {
        	 System.out.println("You Got A");
         }
         else if(grade>=6) {
        	 System.out.println("You Got B+");
         }
         else if(grade>=5) {
        	 System.out.println("You Got B");
         }
         else {
        	 System.out.println("You Got Failed");
         }
	}

}
