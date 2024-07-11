//2. Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short
class TypeConvention{
    public static void main(String[] args){
        
        //float to int
        float b=100.0f;
        int a;
        a=(int)b;
        System.out.println("float to int"+a);

        //double to float
        double x=100.000;
        float y=(float)x;
        System.out.println("double to float"+y);

        //int to short

        int c=40;
        short d=(short)c;
        System.out.println("int to short"+d);
    }
}