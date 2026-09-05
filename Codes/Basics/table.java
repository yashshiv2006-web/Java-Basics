import java.util.*;
 public class table{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int Table = sc.nextInt();
        for (int i = 1 ; i<=10 ; i++) {
            int output = Table*i;
            System.out.print(Table);
            System.out.print(" * ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.print(output);
            System.out.println("");
        }
    }
}