public class referencing{
    public static void update(int marks[]){
        for(int i = 0 ; i <marks.length ; i ++ ){
            marks[i]=marks[i]+1;        }
    }
    public static void main(String arg[]){
        int marks[]= {92,93,94};

        update(marks);
        System.out.println("Marks After Update: ");
        for(int i = 0 ; i< marks.length ; i++){
        System.out.println(marks[i]);
        }
        

        // this tells us that Marks can be update by the function in the main function . so is shows the call by reference.
    }
}
