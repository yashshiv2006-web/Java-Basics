public class floyds_triangle{

    public static void floyds(int n){
        int count = 1 ;
        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(count);
                System.out.print(" ");
                count ++ ;
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        floyds(10);
    }
    
}
