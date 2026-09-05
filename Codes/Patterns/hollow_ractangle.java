public class hollow_ractangle{
    public static  void pattern(int rows , int cols){
        // for lines or rows
        for(int i = 1 ; i <=rows ; i++){
            // for cells or columns 
            for(int j =1 ; j<=cols ; j++){
                // To check boundary condition ...
                if (i == 1 || i == rows || j ==1 ||j==cols){
                    System.out.print("*");
                }else {
                    System.out.print(" ");           
                    }
            }
            System.out.println();
        }
    }
    public static void main(String Args[]){
        pattern(5, 6);

    }
}