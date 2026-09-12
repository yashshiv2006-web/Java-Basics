public class patternfour {
    public static void four(int n ){
        for(int i = 1 ; i <=n ; i++){
            // decresing 
            for(int j  = i ; j >= 1 ; j--){
                System.out.print(j);
            }
            for(int k = 2 ; k <= i ; k++){
                System.out.print(k);
            }System.out.println();
        }
    }
    public static void main(String arg[]){
        four(7);
    }
}
