import java.util.*;

public class half_pyramid{
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        for(int line = 1 ; line <=n ; line++){
            for(int star = 1 ; star <=line ; star++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int line = 0 ; line <= n ; line ++){
            for(int star = n ; star >=line ; star -- ){
                System.out.print("*");
            }
            System.out.println("");
        }
    
    }
    
}
