import java.util.*;
public class Calculator {
    public static void main(String arg[]){
        System.out.print("Enter Number 1 :");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        System.out.print("Enter Number 2 :");
        int b = sc.nextInt();
        System.out.print("Enter the Opertion : + | - | * | / | % :");
        String Solution = sc.next();
        switch(Solution){
            case "+": System.out.print(a+b);
                      break;
            case "-": System.out.print(a-b);
                      break;
            case "*": System.out.print(a*b);
                      break;
            case "/": System.out.print(a/b);
                      break;
            case "%": System.out.print(a%b);
                      break;
            default : System.out.print("Invalid !!!");
        }

    }
}
