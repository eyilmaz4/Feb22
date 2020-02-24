package practice;

public class abcd {
    public static void main(String[] args) {
        letters();
    }
    public static void letters(){


        for(int i=1; i<6; i++){
            System.out.print(i+"\t");

            for( char j='a'; j<'e';j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
