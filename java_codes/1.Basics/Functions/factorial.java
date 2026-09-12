import java.util.*;
public class factorial {

  public static int fact(int n){
    int f = 1  ;
    
    for (int i = 1 ; i <=n ;i++){
      f = f*i;
    }
    return f ;

  }
  public static void main(String Args[]){
    System.out.print("Enter the Number till factorial:");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println("The Factorial is : "+fact(N));
    
  }  
}
