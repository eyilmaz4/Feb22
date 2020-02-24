package practice;

public class myMethod {
   public static void printsome(){
       int x=0;
       do {
           System.out.println("Hello World");
           x++;
       }
       while(x<10);
    }
    public static void printNumbers(){
       for(int i=1; i<=100; i++){
           System.out.println(i);
       }
    }
       public static int returnSomething(int a){
           return a;

    }

    public static void main(String[] args) {
        printsome();
        printNumbers();
    }
}
