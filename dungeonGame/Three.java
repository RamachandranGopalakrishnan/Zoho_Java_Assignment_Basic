package dungeonGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Three {

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
        System.out.println("Enter the row for dragon");
        int dragon_i=sc.nextInt()-1;
        System.out.println("Enter the col for dragon");
        int dragon_j=sc.nextInt()-1;
        List<List<String>> path=new ArrayList<>();
        List<String>t=new ArrayList<>();
        path.add(new ArrayList<>());
        fun(hunter_i,hunter_j,gold_i,gold_j,b,0,t,path);
        System.out.println(path);
        
	}
	  public static int fun(int i,int j,int row,int col,int[][] b,int steps,List<String> t,List<List<String>> path) {
	      //System.out.println(t);
		  if(i<0 || i>=b.length || j<0 || j>=b[0].length ||b[i][j]==-1) {
	    		return Integer.MAX_VALUE;
	    	}
	    	if(i==row && j==col) {
	    		if(path.get(0).size()==0 || t.size()>0 && t.size()<path.get(0).size()) {
	    			path.clear();
	    			path.add(t);
	    		}
	    		return steps;
	    	}
	        int temp=b[i][j];
	    	b[i][j]=-1;
	    	t.add(i+" "+(j+1));
	    	int right=fun(i,j+1,row,col,b,steps+1,new ArrayList<>(t),path);
	    	t.remove(t.size()-1);
	    	t.add(i+" "+(j-1));
	    	int left=fun(i,j-1,row,col,b,steps+1,new ArrayList<>(t),path);
	    	t.remove(t.size()-1);
	    	t.add((i-1)+" "+j);
	    	int up=fun(i-1,j,row,col,b,steps+1,new ArrayList<>(t),path);
	    	t.remove(t.size()-1);
	    	t.add((i+1)+" "+j);
	    	int down=fun(i+1,j,row,col,b,steps+1,new ArrayList<>(t),path);
	    	b[i][j]=temp;
	    	return Math.min(Math.min(up, down),Math.min(right, left));
	    	
}
}
