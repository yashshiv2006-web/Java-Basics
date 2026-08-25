import java.util.*;

 public class table{
    public static void main(String arg[]){
    System.out.print("Enter the Number whose table you want: ");
     Scanner sc = new Scanner(System.in);
     int table_of_num = sc.nextInt();
     for(int i = 1 ; i <=10 ; i++){
      int table = table_of_num*i;
       System.out.println(table);
     }     

    }
}
