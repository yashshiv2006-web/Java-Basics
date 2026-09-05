import java.util.*;

public class average_of_three_numbers {
    public static void main(String arg[]){
        System.out.print("This is the avg calculator of 3 numbers!!!\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b = sc.nextInt();
        System.out.print("c:");
        int c = sc.nextInt();
        int d = (a+b+c);
        int avg = d/3;
        System.out.println("Average is:"+avg);
    }
    
}
