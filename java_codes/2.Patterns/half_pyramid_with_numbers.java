public class half_pyramid_with_numbers {
    public static void number(int n ){
        for(int i = 0 ; i <= n ; i ++){
            for(int j = 1 ; j <=n-i+1 ; j++){
                System.out.print(j);
                System.out.print(" ");
            }System.out.println();
        }
    }
    public static void main(String arg[]){
        number(4);
    }
}
