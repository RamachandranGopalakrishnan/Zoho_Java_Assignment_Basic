import java.util.Scanner;

public class WeekDays {
    enum Days{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int val=sc.nextInt();
        System.out.println(val);
        val%=7;
        for(Days w:Days.values()){
            if(w.ordinal()==val){
                System.out.println(w);
            }
        }
        sc.close();
    }
}
