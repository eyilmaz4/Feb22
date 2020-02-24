package practice;

public class backward {
    public static void main(String[] args) {
        back("java123");
        System.out.println(reverseText("java"));
       sayPalindrome("madam");
    }

    public static void back(String word) {

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print((word.charAt(i)));

        }
        System.out.println();


    }

    public static String reverseText(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result = result + text.charAt(i);
        }
        return result;


    }

    public static void sayPalindrome(String a) {
        String b = reverseText(a);
        if(b.equalsIgnoreCase(a)){
            System.out.println("palindroome");}
            else{
                System.out.println("not");
            }
        }

        }



