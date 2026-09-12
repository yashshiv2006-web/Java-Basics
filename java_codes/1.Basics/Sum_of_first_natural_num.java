import java.util.*  ;
public class Sum_of_first_natural_num {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        // Sum of first Natural Number 
        System.out.print("Enter the Num: ");
        int n = sc.nextInt();
        int sum = 0 ;
        int i = 1;
        while( i <= n){
            sum = sum+i;
            i++;
        }
        System.out.println("The sum till this Number is :"+sum);
    }
    
}
