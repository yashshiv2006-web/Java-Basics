import java.util.*;
public class largest_in_array {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE ; //signifies -infinity 
        for(int i = 0 ; i <arr.length ; i ++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
       return largest ;
    }

    public static void main(String arg[]){
    int arr[]={1,2,3,4,34,565,67,10};
    System.out.println("Largest number:"+largest(arr));
}
}










