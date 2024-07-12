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
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	b cannot be resolved to a variable

	at Assignment_Two/Scope_operators.Statement.main(Statement.java:12)
