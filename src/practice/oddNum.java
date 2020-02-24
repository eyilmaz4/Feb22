package practice;

public class oddNum {
    public static void printOdd(int x, int y){
        if(x %2==0 && y %2==0) {
            System.out.println("");
        }
        else if( x %2!=0 && y %2!=0){
            System.out.println(" "+x+" "+y);
        }
        else if( ( x %2!=0 && y %2==0)){
            System.out.println(x);
        }
        else if( ( x %2==0 && y %2!=0)){
            System.out.println(y);
        }

    }
    public static void printEvens(int start, int end){
        for(int i=start; i<end; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printOdd(2,9);
        printEvens(4,7);
    }
}
