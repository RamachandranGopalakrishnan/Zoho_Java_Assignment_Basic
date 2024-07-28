package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the n value");
         int n=sc.nextInt();
         int arr[][]=new int[n][n];
         int number=1;
         int up=0;
         int down=n-1;
         int right=0;
         int left=n-1;
         
        while(up<=down && right<=left) { 
        	
        	for(int i=right;i<=left;i++) {
        		arr[up][i]=number++;
        	}
        	up++;
        	for(int i=up;i<=down;i++) {
        		arr[i][left]=number++;
        	}
        	left--;
        	for(int i=left;i>=right;i--) {
        		arr[down][i]=number++;
        	}
        	down--;
        	for(int i=down;i>=up;i--) {
        		arr[i][right]=number++;
        	}
        	right++;
        }
        
        for(int[] i:arr) {
        	System.out.println(Arrays.toString(i));
        }
	}

}
