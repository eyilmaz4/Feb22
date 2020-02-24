package practice;

public class pyramidMethod {
    public static void pyramid(int numberofLine){
        for(int i=1; i<numberofLine; i++){
            for(int j=1; j<i; j++){
                System.out.print(" *");
            }
            for(int k=i; k<5; k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
