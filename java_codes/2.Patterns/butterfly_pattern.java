public class butterfly_pattern {
    public static void butterfly(int n ){
//  First face 

        for (int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j <=i ;j ++){
                System.out.print("*");
            }
            for(int j = 1  ; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i ;j ++){
                System.out.print("*");
            }
            System.out.println();
        }
//  Second face 
        for (int i = n ; i >= 1 ; i-- ){
            for(int j = 1 ; j <=i ;j ++){
                System.out.print("*");
            }
            for(int j = 1  ; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=i ;j ++){
                System.out.print("*");
            }
            System.out.println();   
        }
    }
    public static void main(String arg[]){
        butterfly(10);

    }
}
