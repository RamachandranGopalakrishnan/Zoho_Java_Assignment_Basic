package ThirdAssignment;

import java.util.Scanner;

public class EvenSum {

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
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			sum+=arr[i];
		}
	}
	System.out.println("The Even Sum is"+sum);
	}

}
