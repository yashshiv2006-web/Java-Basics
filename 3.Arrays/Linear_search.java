import java.util.*;

public class Linear_search {
    public static void search(int arr[],int key){
        boolean found  = false ;
        for(int i = 0 ; i <= arr.length; i ++){
        if(arr[i]== key){
            System.out.println("key found at index  : "+i);
            found = true;
            break ;
        }
        }if(!found){
              System.out.print("Not found");
        }
    } 

    public static void main(String arg[]){
    int arr[]={1,2,3,4,34,565,67,10};
    int key = 10 ;
    search(arr , key);
}
}