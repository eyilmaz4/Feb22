package practice;

public class AsciiMethod {
    public static void main(String[] args) {
        charValues();
    }
    public static void charValues(){

        for(char i=0;i<256; i++ ){
            System.out.println(i);
        }//or int i sout("number"+i+""+(char)i)
    }
}
