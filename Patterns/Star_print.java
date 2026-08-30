import java.util.*;
import java.util.Scanner;

public class Star_print {
    public static void main(String arg[]){

        Scanner  = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        for(int line = 1 ; line <=n ; line++){
            for(int star = 1 ; star <=line ; star++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
