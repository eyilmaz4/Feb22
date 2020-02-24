package practice;

public class upsideTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
//for loop for the spaces
            for (int j = 0; j <= 10 - i; j++) {
                System.out.print(" ");
            }
// for loop for starts

            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

}