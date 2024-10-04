package game;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	static char[][] board=new char[3][3];
	static char previousChoice;
	static int count=0;
    public static void main(String args[]) {
    	boolean flag=true;
    	while(flag) {
    		System.out.println("Enter the 1 to play");
    		System.out.println("Enter the 2 to exist");
    		int opt=sc.nextInt();
    		switch(opt){
    			case 1:
    				rec();
    				break;
    				
    			case 2:
    				flag=false;
    				System.out.println("Existing");
    				break;
    		}
    	}
        
    }
    public static void rec() {
    	if(count>=9) {
    		System.out.println("Its draw bro");
    	}
    	printBoard();
    	System.out.println("Enter the row number");
    	int row=sc.nextInt();
    	System.out.println("Enter the column number");
    	int column=sc.nextInt();
    	System.out.println("Enter X or O");
    	sc.nextLine();
    	char choice=sc.nextLine().charAt(0);
    	//System.out.println(choice);
    	if(row>2 ||row<0 || column<0 || column>2) {
    		System.out.println("invalid index byeee...enter again");
    		rec();
    	}
    	if(board[row][column]=='x' || board[row][column]=='o') {
    		System.out.println("This is already filled");
    		rec();
    	}
    	else if(previousChoice==choice) {
    		char option=previousChoice=='x'?'o':'x';
    		System.out.println("you should enter "+" "+option +" try again");
    		rec();
    	}
    	else {
    		board[row][column]=choice;
    		count+=1;
    		previousChoice=choice;
    		char winner=findWinner();
    		if(winner=='x') {
    			printBoard() ;
    			System.out.println("player one is the winner");
    			return;
    		}
    		else if(winner=='o') {
    			printBoard() ;
    			System.out.println("player two is the winner");
    			return ;
    		}
    		rec();
    	}
    }
    public static char findWinner() {
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			boolean flag=helper(i,j,board[i][j],0);
    			if(flag) {
    				return board[i][j];
    			}
    		}
    	}
		return ' ';
    }
    public static boolean helper(int i,int j,char opt,int count) {
		if(i<0 || i>2 || j<0 || j>2 || board[i][j]=='.') {
			return false;
		}
    	if(count==3) {
    		return true;
    	}
    	if(board[i][j]==opt) {
    		count+=1;
    	}
    	char temp=board[i][j];
    	board[i][j]='.';
    	boolean right=helper(i,j+1,opt,count);
    	boolean left=helper(i,j-1,opt,count);
    	boolean up=helper(i-1,j,opt,count);
    	boolean down=helper(i+1,j,opt,count);
    	board[i][j]=temp;
    	return right || left || up || down;
    }
    public static void printBoard() {
    	for(int i=0;i<=2;i++) {
    		for(int j=0;j<=2;j++) {
    			char x=board[i][j];
    			if(x=='x' || x=='o')System.out.print(" "+board[i][j]+" ");
    			else System.out.print(" "+"___"+" ");
    		}
    		System.out.println();
    	}
    }
}
