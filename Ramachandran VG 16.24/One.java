package Zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {13,-3,-5,-100,-1};
		int even=0;
		int odd=0;
	    for(int i=0;i<arr.length;i++) {
	    	if(i%2==0) {
	    		even++;
	    	}
	    	else {
	    		odd++;
	    	}
	    }
	    int arr1[]=new int[even];
	    int arr2[]=new int[odd];
	    int ind1=0;
	    int ind2=0;
	    for(int i=0;i<arr.length;i++) {
	    	if(i%2==0) {
	    		arr1[ind1++]=arr[i];
	    	}
	    	else {
	    		arr2[ind2++]=arr[i];
	    	}
	    }
	    sort(arr1);
	    sort(arr2);
	    
	    
	    int evenLen=arr1.length-1;
	    int oddLen=0;
	    int ind=0;
	    while(evenLen>=0 && oddLen<arr2.length) {
	    	arr[ind++]=arr1[evenLen--];
	    	arr[ind++]=arr2[oddLen++];
	    }
	    while(oddLen<arr2.length) {
	    	arr[ind++]=arr2[oddLen++];
	    }
	    while(evenLen>=0) {
	    	arr[ind++]=arr1[evenLen--];
	    }
	    System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
	}

}
