import java.util.*;
public class reverse_array {
    public static void reverse(int arr[]){
        int first = 0 ;
        int end = arr.length - 1 ;
        while(first < end){
            int temp = arr[first];
            arr[first]=arr[end];
            arr[end]=temp ;
            first ++;
            end -- ;
            }   
    }
    public static void main (String[] arg) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Original Array :");
        for(int i = 0 ; i <=arr.length -1 ; i ++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        reverse(arr);
        System.out.print("Reversed Array :");
        for(int i = 0 ; i <= arr.length-1 ; i++){
            System.out.print(arr[i]+ " ");
        }
   
    }   
}
