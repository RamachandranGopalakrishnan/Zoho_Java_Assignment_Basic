package Scope_operators;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=10;
         if(true) {
        	 int b=10;
        	 System.out.println("a and b value "+a+" "+b);
         }
         System.out.println("a and b value "+a+" "+b);
	}

}

//Compile time error