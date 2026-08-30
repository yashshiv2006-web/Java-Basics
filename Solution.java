import java.util.*;

public class Solution{
    public static void main(String[]args){
        System.out.print("Enter Your Temprature : ");
        Scanner sc = new Scanner(System.in);
        Float temp = sc.nextFloat();
        if (temp <100.0){
            System.out.print("You do not have fever !\n");
        }
        else{
            System.out.println("You are in fever !");
        }
    }
}