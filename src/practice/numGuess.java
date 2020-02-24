package practice;


import java.util.Scanner;


public class numGuess {
    public static void main(String[] args) {
        numGuessGame(12);
    }

    public static void numGuessGame(int a) {
        Scanner x = new Scanner(System.in);
        int number = 10;
        System.out.println("guess number");
        while (a != number) {

            a = x.nextInt();

            if (a == number) {
                System.out.println("congrats");
            } else if (a < number) {
                System.out.println("bigger please");
            } else if (a >= number) {
                System.out.println("smaller please");
            } else {
                System.out.println("error");
            }
        }
    }
}
