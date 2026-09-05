public class Alphabets{
    public static void main(String Gemini[]){
        char ch = 'A';
        int line  = 5;
        for(line = 1 ; line <= 5 ; line ++){
            for(int chars = '1'; chars <= line ;chars++){
                System.out.print( ch );
                ch++;
            }
            System.out.println();
        }
    }
}