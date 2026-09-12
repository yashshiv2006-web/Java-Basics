import java.util.*;

public class Binary_search {
    public static int binary(int key , int arr[]){
        int start = 0 ;
        int end = arr.length -1; // n-1

        while(start<=end){
            int mid = (start +end)/ 2 ;
            if (arr[mid]==key){
                return mid ;
            }
            if(arr[mid]<key ) {//right
                start = mid+1;   
            }
            else{    //left 
                end = mid-1;
            }
        }
        return -1 ;
    }
    public static void main(String[] arg){
        int arr[] = {1,2,3,4,5,6,7,8,9,10 ,12 ,14 , 16 , 18  , 20 };
        int key = 18 ;
        System.out.print("Key is found at : "+ binary(key, arr));
    }
}
    
