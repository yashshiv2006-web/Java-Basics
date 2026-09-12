public class Pascaltriangle {
    public static void main(String[] arg){
        int arr[][]= new int[10][10];
        for(int i = 0 ; i <= 5 ; i ++){
            for(int j =0 ; j <i ; j++){
                if(j == 0 || j == i ){
                    arr[i][j]= 1 ;
                    System.out.print(arr[i][j]);
                }else{  
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                    System.out.print(arr[i][j]);

                }
            }System.out.println();
        }
    }
}
