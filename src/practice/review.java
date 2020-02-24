package practice;

import java.sql.SQLOutput;

public class review {
    public static void myName(){
        System.out.println("Esra");
    }
public static void printMyname(String name) {
    System.out.println(name);
}
public static String printMyname3(){
        return "Esra";
}
public static String printmyName4(String name){
        return name;
}
    public static void main(String[] args) {
    myName();
    printMyname("ayse");
        System.out.println(printMyname3());
        System.out.println(printmyName4("bahar"));

}
    }