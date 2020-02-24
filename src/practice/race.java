package practice;




public class race {
    public static void main(String[] args) {
        System.out.println("is madam a palindrome?"+isPalindrome(("madam")));

    }

    public static boolean isPalindrome(String a) {
        boolean result = true;
        int end = a.length() - 1;

        for (int i = 0; i <= a.length() - 1; i++) {
            if (a.charAt(i) != a.charAt(end)) {
                result = false;
            }
            end--;
        }
        return result;




}
}

