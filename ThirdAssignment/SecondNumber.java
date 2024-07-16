package ThirdAssignment;

import java.util.Scanner;

public class SecondNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
	System.out.println("how many number to enter in array");
	int size=sc.nextInt();
	int[] arr=new int[size];
	int ind=0;
	
	while(size>0) {
		System.out.println("Enter the number");
		arr[ind++]=sc.nextInt();
		size--;
	}
	
	System.out.println("enter the number you want to their second location");
	int value=sc.nextInt();
	int got=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==value)got++;
		if(got==2) {
			System.out.println("The Second Location is"+i);
			break;
		}
	}
	if(got<=1) {
		System.out.println("No Index Found");
	}
	}

}
