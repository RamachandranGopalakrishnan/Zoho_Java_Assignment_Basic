package FouthAssignment;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               System.out.println(add(5,4));
               System.out.println(add(5,4,11));
               System.out.println(sub(5,4));
               System.out.println(sub(5,4,10));
               System.out.println(div(12,4));
               System.out.println(div(12,3,4));
               System.out.println(mul(5,4));
               System.out.println(sub(5,4,10));
               
               //float
               System.out.println(add(5.0f,4.0f));
               System.out.println(add(5.0f,4.0f,11.0f));
               System.out.println(sub(5.0f,4.0f));
               System.out.println(sub(5.0f,4.0f,10.0f));
               System.out.println(div(12.0f,4.0f));
               System.out.println(div(12.0f,3.0f,4.0f));
               System.out.println(mul(5.0f,4.0f));
               System.out.println(sub(5.0f,4.0f,10.0f));
               
               //double
               System.out.println(add(5.00,4.00));
               System.out.println(add(5.00,4.00,11.00));
               System.out.println(sub(5.00,4.00));
               System.out.println(sub(5.0,4.0,10.00));
               System.out.println(div(12.00,4.00));
               System.out.println(div(12.00,3.00,4.00));
               System.out.println(mul(5.00,4.00));
               System.out.println(sub(5.00,4.00,10.00));
	}
    public static int add(int a,int b) {
    	return a+b;
    }
    public static int add(int a,int b,int c) {
    	return a+b+c;
    }
    public static int sub(int a,int b) {
    	return a-b;
    }
    public static int sub(int a,int b,int c) {
    	return a-b-c;
    }
    public static int div(int a,int b) {
    	return a/b;
    }
    public static int div(int a,int b,int c) {
    	return (a/b)/c;
    }
    public static int mul(int a,int b) {
    	return a*b;
    }
    public static int mul(int a,int b,int c) {
    	return a*b*c;
    }
    
    //float
    public static float add(float a,float b) {
    	return a+b;
    }
    public static float add(float a,float b,float c) {
    	return a+b+c;
    }
    public static float sub(float a,float b) {
    	return a-b;
    }
    public static float sub(float a,float b,float c) {
    	return a-b-c;
    }
    public static float div(float a,float b) {
    	return a/b;
    }
    public static float div(float a,float b,float c) {
    	return (a/b)/c;
    }
    public static float mul(float a,float b) {
    	return a*b;
    }
    public static float mul(float a,float b,float c) {
    	return a*b*c;
    }
    
    //double
    
    public static double add(double a,double b) {
    	return a+b;
    }
    public static double add(double a,double b,double c) {
    	return a+b+c;
    }
    public static double sub(double a,double b) {
    	return a-b;
    }
    public static double sub(double a,double b,double c) {
    	return a-b-c;
    }
    public static double div(double a,double b) {
    	return a/b;
    }
    public static double div(double a,double b,double c) {
    	return (a/b)/c;
    }
    public static double mul(double a,double b) {
    	return a*b;
    }
    public static double mul(double a,double b,double c) {
    	return a*b*c;
    }
}
