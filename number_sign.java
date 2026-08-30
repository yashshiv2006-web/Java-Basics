import java.util.*;

public class number_sign{
    public static void main(String arg[]){
        System.out.print("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==0){
            System.out.println("Zero entered!");
        }
        else if (a<0){
            System.out.println("Negative");
        }
        else{
            System.out.print("Positive");
        }
        
    }
}