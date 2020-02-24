package practice;

public class topBottom {
    public static void main(String[] args) {
        topToBottom("Hello");
    }
    public static void topToBottom(String a){
        //for(int i=1; i<a.length(); i++){
            for(int j=0; j<a.length(); j++){
                System.out.println(a.charAt(j));
            }
        }
    }
