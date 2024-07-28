package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=sc.nextInt();
		System.out.println("Enter the col size");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("arr["+i+"]["+j+"]=");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}
		for(int i=0;i<row;i++) {
			for(int j=i;j<col;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		System.out.println();
		for(int[] i:arr) {
			System.out.println(Arrays.toString(i));
		}
	}

}
