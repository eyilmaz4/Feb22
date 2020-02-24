package practice;

public class passCheck {
    public static void main(String[] args) {
        checkPass("any");
        String check = passCheck("lily");
        System.out.println(check);
        System.out.println( isPassOk("method"));
    }

    public static void checkPass(String pass) {
        if (pass.length() >= 6) {
            System.out.println("ok");
        } else if (pass.length() < 6) {
            System.out.println("password must be at least 6 character");
        }
    }

    public static String passCheck(String pass) {
        String result;
        if (pass.length() >= 6) {
            result = "ok";
        } else {
            result = "not ok";
        }
        return result;
    }

    public static boolean isPassOk(String pass) {
        boolean result;
        if (pass.length() >= 6) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }}




