package practice;

public class oddLoopM {
    public static void main(String[] args) {
        odd();
    }
    public static void odd(){
        for(int i=1; i<16; i++){
            while(i<=5){
                System.out.print(i+"\t");
i++;
            }
            System.out.println();
            while(i>=6 && i<=10){
                System.out.print(i+"\t");
                i++;
            }
            System.out.println();
            while(i>10 && i<=15){
                System.out.print(i+"\t");
                i++;
            }
            System.out.println();
        }
    }
}
