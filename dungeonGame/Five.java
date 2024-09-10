package dungeonGame;

import java.util.HashSet;
import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
      
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row for board");
        int row=sc.nextInt();
        System.out.println("Enter the col for board");
        int col=sc.nextInt();
        int[][] b=new int[row][col];
        System.out.println("Enter the row for gold");
        int gold_i=sc.nextInt()-1;
        System.out.println("Enter the col for gold");
        int gold_j=sc.nextInt()-1;
        System.out.println("Enter the row for hunter");
        int hunter_i=sc.nextInt()-1;
        System.out.println("Enter the col for hunter");
        int hunter_j=sc.nextInt()-1;
        System.out.println("Enter the number of pits");
        int numberOfPits=sc.nextInt();
        HashSet<String> hs=new HashSet<>();
        while(numberOfPits-->0) {
        	System.out.println("Enter the i");
        	int i=sc.nextInt();
        	System.out.println("Enter the j");
        	int j=sc.nextInt();
        	hs.add(i+" "+j);
        }
        //System.out.println(gold_i+" "+gold_j);
        
        int ans=fun(hunter_i,hunter_j,gold_i,gold_j,b,0,hs);
        
        
        System.out.println(ans);
	}
    public static int fun(int i,int j,int row,int col,int[][] b,int steps,HashSet<String> hs) {
    	if(i<0 || i>=b.length || j<0 || j>=b[0].length ||b[i][j]==-1 || hs.contains(i+" "+j)) {
    		return Integer.MAX_VALUE;
    	}
    	if(i==row && j==col) {
    		//System.out.println(steps);
    		return steps;
    	}
        int temp=b[i][j];
    	b[i][j]=-1;
    	int right=fun(i,j+1,row,col,b,steps+1,hs);
    	int left=fun(i,j-1,row,col,b,steps+1,hs);
    	int up=fun(i-1,j,row,col,b,steps+1,hs);
    	int down=fun(i+1,j,row,col,b,steps+1,hs);
    	b[i][j]=temp;
    	return Math.min(Math.min(up, down),Math.min(right, left));
    }
}
