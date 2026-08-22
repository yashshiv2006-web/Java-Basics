import java.util.*;

public class marks_student{
    public static void main(String arg[]){
        System.out.print("Enter your Marks:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String Result = (marks>=33)? "PASS" : "FAIL";
        System.out.print(Result);
    }
}