package practice;

public class Ascii {
    public static void ascii() {
        char x = 'a';
        while (x < 256) {
            System.out.print(x);
            x++;
        }
    }


    public static void main(String[] args) {
        ascii();
    }}