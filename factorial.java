import java.util.*;

public class 15.factorial{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int fact = n;
        for(int i=1 ;(n-i)>=1;i++){
        fact = fact*(n-i);
        }
        System.out.print("Factorial: "+fact);
    }
}