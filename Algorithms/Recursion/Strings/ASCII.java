package Recursion.Strings;

import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
//        ascii("", "abc");
        System.out.println(asciis("", "abc"));
    }
    static void ascii(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        ascii(p+ch, up.substring(1));
        ascii(p, up.substring(1));
        ascii(p+ (ch+0), up.substring(1));
    }

     private static ArrayList<String> asciis(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         ArrayList<String> left = asciis(p+ch, up.substring(1));
         ArrayList<String> right = asciis(p, up.substring(1));
         ArrayList<String> mid = asciis(p+ (ch+0), up.substring(1));

         left.addAll(right);
         left.addAll(mid);
         return left;
    }
}
