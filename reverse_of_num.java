public class 12.reverse_of_num {
    public static void main(String arg[]){
    int n = 120906; 
    while( n > 0 ){
        int last_digit = n%10;
        System.out.print(last_digit);
        n = n/10;  
       }   
        System.out.println( );

    }
    
        

}
