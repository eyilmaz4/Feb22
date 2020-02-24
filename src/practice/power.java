package practice;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("enter number and power");
        int number=x.nextInt();
        int power=x.nextInt();
        double result=Math.pow(number, power);
        System.out.println((int)result);
        topBottom.topToBottom("Java");
    }

}
