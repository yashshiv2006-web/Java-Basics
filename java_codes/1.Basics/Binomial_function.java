import java.util.*;
public class Binomial_function {

     public static  int  fact( int N ) {
        int f = 1;
        for(int i = 1 ; i <= N ; i ++){
            f= f*i;             
        }
        return f;
        }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("nCr! calculation :-");
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        System.out.println("The the value of the factorial is : "+fact(n));
        int Factn = fact(n);
        System.out.print("Enter r = ");
        int r = sc.nextInt();
        System.out.println("The the value of the factorial is : "+fact(r));
        int Factr = fact(r);
        System.out.println("The Dino :");
        int Dino = (n-r);
        System.out.println("The Denominator : " +fact(Dino));
        int FactDino = fact(Dino);

        // Formula nCr! = n!  / (r!*(n-r)!);
        int nCr = Factn / (Factr*(FactDino));

        System.out.println("The nCr! is : "+nCr);

    }
   

}