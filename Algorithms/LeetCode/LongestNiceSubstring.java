package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {
        String s = "YaBbaAy";
        System.out.println(longestNiceSubstring(s));
    }
    static String longestNiceSubstring(String s) {
        if(s.length() < 2) return "";
//        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
//        for(char c : arr) {
//            set.add(c);
//        }
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) {
                continue;
            }
                String sub1 = longestNiceSubstring(s.substring(0, i));
                String sub2 = longestNiceSubstring(s.substring(i+1));
                if(sub1.length()>=sub2.length()) {
                    return sub1;
                } else {
                    return sub2;
                }
        }
        return s;
    }
}
