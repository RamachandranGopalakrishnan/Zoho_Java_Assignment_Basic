import java.util.Scanner;

public class Averge {
    public static void main(String[] args){
        int count=1;
        int totalWeight=0;
        Scanner sc =new Scanner(System.in);
        while(count++<=10){
            System.out.println("Enter the weight of "+count+"persons");
            totalWeight+=sc.nextInt();
        }
        System.out.println("The Averge Weigth of ten persons is"+totalWeight/10);
        sc.close();
    }
}
