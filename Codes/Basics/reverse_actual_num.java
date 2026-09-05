public class reverse_actual_num {
    public static void main(String arg[]){
        int n = 120906 ;
        int rev = 0;
        while(n>0){
            int last_digit = n%10;
            rev = (rev*10)+last_digit;
            n /=10 ;
        }
        System.out.print(rev);
    }
}
