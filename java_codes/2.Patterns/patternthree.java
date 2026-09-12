public class patternthree {
    public static void three(int n){
        for(int i = 1 ; i <=n ; i++){
            for(int j = n ; j >= i ; j --){
                System.out.print(j);}
            for(int k = i+1 ; k <= n ; k ++ ){
                System.out.print(k);
            }System.out.println();
            }
        }
    public static void main(String arg[]){
        three(5);
    }
}

