import java.util.*;
public class Largestofthreenumbers {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();


        if ( a > b && a > c){
            System.out.print("a="+a);
        }
        else if(b>a && b>c){
            System.out.print("b="+b);
        }
        else {
            System.out.print(c);
        }

    }
}
