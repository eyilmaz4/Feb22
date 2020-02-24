package practice;

public class parameter {
    public static void printMultiHelloWorld(int x) {
//x number of repeat
        for (int i = 1; i <= x; i++) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        printMultiHelloWorld(3);
    }
}