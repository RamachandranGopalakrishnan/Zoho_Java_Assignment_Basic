package dungeonGame;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        System.out.println("Enter the row for trigger");
        int trigger_i=sc.nextInt()-1;
        System.out.println("Enter the col for trigger");
        int trigger_j=sc.nextInt()-1;
        System.out.println(trigger_i+" "+trigger_j);
        
        int forHunter= fun(hunter_i,hunter_j,gold_i,gold_j,b,0);
        int forDragon= fun(dragon_i,dragon_j,gold_i,gold_j,b,0);
        int withTrigger=0;
        int fromTrigger=0;
        System.out.println(forHunter+" "+forDragon);
        if(forDragon<forHunter) {
        	withTrigger=fun(hunter_i,hunter_j,trigger_i,trigger_j,b,0);
                fromTigger=fun(trigger_i,trigger_j,gold_i,gold_j,b,0);
		System.out.println(withTrigger+fromTrigger);
        }
       else{
            System.out.println(forHunter);
		    }
}
    public static int fun(int i,int j,int row,int col,int[][] b,int steps) {
    	if(i<0 || i>=b.length || j<0 || j>=b[0].length ||b[i][j]==-1) {
    		return Integer.MAX_VALUE;
    	}
    	if(i==row && j==col) {
    		//System.out.println(steps);
    		return steps;
    	}
        int temp=b[i][j];
    	b[i][j]=-1;
    	int right=fun(i,j+1,row,col,b,steps+1);
    	int left=fun(i,j-1,row,col,b,steps+1);
    	int up=fun(i-1,j,row,col,b,steps+1);
    	int down=fun(i+1,j,row,col,b,steps+1);
    	b[i][j]=temp;
    	return Math.min(Math.min(up, down),Math.min(right, left));
    }
}
