package Recursion.Strings;

public class StringsSkipString {
    public static void main(String[] args) {
        System.out.println(stringSkipApple("baccappledappleah"));
    }
    static void stringSkip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            stringSkip(p, up.substring(1));
        } else {
            stringSkip(p + ch, up.substring(1));
        }
    }

    static String stringSkipApple(String up) {
        if(up.isEmpty()) {
            return "";
        }
        if(up.startsWith("apple")) {
            return stringSkipApple(up.substring(5));
        } else {
            return up.charAt(0) + stringSkipApple(up.substring(1));
        }
    }
}
