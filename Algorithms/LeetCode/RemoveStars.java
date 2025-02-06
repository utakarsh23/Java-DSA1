package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class RemoveStars {
    public static void main(String[] args) {
        String s = "erase***";
        System.out.println(removeStars1(s));
    }

    static String removeStars(String s) {
        StringBuilder sc = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if(s.charAt(i) == '*') {
                sc.deleteCharAt(sc.length()-1);
            } else {
                sc.append(s.charAt(i));
            }
            i++;
        }
        return sc.toString();
    }

    static String removeStars1(String s) {
        int i = 0;
        List<Character> ch = new ArrayList<>();
        while (i < s.length()) {
            if(s.charAt(i) == '*') {
                ch.removeLast();
            } else {
                ch.add(s.charAt(i));
            }
            i++;
        }
        String sh = "";
        for (int j = 0; j < ch.size(); j++) {
            sh = sh+s.charAt(j);
        }
        return sh;
    }
}
