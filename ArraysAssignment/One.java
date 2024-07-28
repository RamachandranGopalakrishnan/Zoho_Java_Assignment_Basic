package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int size=0;
		  Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size");
          size=sc.nextInt();
          int[] arr=new int[size];
          int ind=0;
          while(size-->0) {
        	  System.out.println("Enter the number");
        	  arr[ind++]=sc.nextInt();
        	  
          }
          System.out.println("Enter the k number");
          int k=sc.nextInt();
          k=k%arr.length;
          reverse(arr,0,arr.length-1);
          reverse(arr,0,k-1);
          reverse(arr,k,arr.length-1);
          System.out.println(Arrays.toString(arr));
          sc.close();
	}
	public static void reverse(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
