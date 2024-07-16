package ThirdAssignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N");
		int N=sc.nextInt();
		 boolean flag[] = new boolean[N+1];
	        for(int i=2;i<=Math.sqrt(N);i++){
	            for(int j=i+i;j<=N;j+=i){
	                flag[j]=true;
	            }
	        }
	        for(int i=2;i<=N;i++){
	            if(!flag[i]) System.out.print(i+" ");
	        }
	}

}
