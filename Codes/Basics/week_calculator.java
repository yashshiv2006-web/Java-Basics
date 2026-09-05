import java.util.*;
public class week_calculator{
    public static void main(String arg[]){
        System.out.println("Enter the Day from 1-7 Week wise :");
        Scanner sc = new Scanner(System.in);
        int Week = sc.nextInt();
        switch(Week) {
            case 1 : System.out.println("Monday !!!");
                     break;
            case 2 : System.out.println("Tuesday !!!");
                     break;
            case 3 : System.out.println("Wednesday !!!");
                     break;
            case 4 : System.out.println("Thursday !!!");
                     break;
            case 5 : System.out.println("Friday!!!");
                     break;
            case 6 : System.out.println("Saturday !!!");
                     break;
            case 7 : System.out.println("Sunday!!!");
                     break;
            default: System.out.println("Invalid !!");
        }
    }

}