package ArraysAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class WightOfThePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the total person");
         int n=sc.nextInt();
         int arr[][]=new int[n][];
         for(int i=0;i<n;i++) {
        	 arr[i]=new int[0];
         }
         boolean flag=true;
         while(flag){
        	 System.out.print("enter the nth person");
        	 int i=sc.nextInt();
        	 int j=arr[i-1].length;
        	 int newarr[]=new int[j+1];
        	 int ind=0;
        	 int[] copy=arr[i-1];
        	   newarr=Arrays.copyOf(copy,copy.length+1);
        	  System.out.println("Enter the Weight");
        	  newarr[newarr.length-1]=sc.nextInt();
        	  arr[i-1]=newarr;
        	  System.out.println("still what to enter the weight? enter 1 to yes and 0 to no");
        	  int opt=sc.nextInt();
        	  if(opt==0)flag=false;
         }
         for(int[] i:arr) {
        	 System.out.println(Arrays.toString(i));
         }
         System.out.println("Enter the N person to get minimum");
         int v=sc.nextInt();
         int max=1000000;
         for(int i=0;i<arr[v-1].length;i++) {
        	 max=Math.min(arr[v-1][i], max);
         }
         System.out.println(max);
	}

}
