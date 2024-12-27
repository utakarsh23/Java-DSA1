package Recursion.Strings;

public class Strings {
    public static void main(String[] args) {
        stringSkip("", "baccdah");
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

    static String stringSkipReturn(String up) {
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return stringSkipReturn(up.substring(1));
        } else {
            return stringSkipReturn(up.substring(1));
        }
    }
}
