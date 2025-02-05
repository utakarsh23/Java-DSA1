package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#cde#f##xy", t = "ab#cde#fi###xy";
        System.out.println(backspaceCompare(s, t));
    }

//    static boolean backspaceCompare(String s, String t) {
//        List<Character> sh = new ArrayList<>();
//        List<Character> th = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++) {
//            sh.add(s.charAt(i));
//        }
//        for (int i = 0; i < t.length(); i++) {
//            th.add(t.charAt(i));
//        }
//        int i = 0;
//        while (i < s.length()) {
//            if(i > 0 && sh.get(i) == '#') {
//                sh.remove(i);
//                sh.remove(i-1);
//                continue;
//            }
//            i++;
//        }
//        return true;
//    }

//    static boolean backspaceCompare(String s, String t) {
//        int i = s.length()-1;
//        int j = t.length()-1;
//        int hasCount = 0;
//        int hasCount1 = 0;
//        StringBuffer sb = new StringBuffer();
//        StringBuffer st = new StringBuffer();
//        while (i >= 0) {
//            while (s.charAt(i) == '#') {
//                hasCount++;
//                i--;
//            }
//            if(hasCount == 0) {
//                sb.append(s.charAt(i));
//            } else {
//                hasCount--;
//            }
//            i--;
//        }
//        while (j >= 0) {
//            while (t.charAt(j) == '#') {
//                hasCount1++;
//                j--;
//            }
//            if(hasCount1 == 0) {
//                st.append(t.charAt(j));
//            } else {
//                hasCount1--;
//            }
//            j--;
//        }
//        return sb.compareTo(st) == 0;
//    }

    static boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1, back;
        while (true) {
            back = 0;
            while (i >= 0 && (back > 0 || s.charAt(i) == '#')) {
                back += s.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || t.charAt(j) == '#')) {
                back += t.charAt(j) == '#' ? 1 : -1;
                j--;
            }
            if (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
                i--;
                j--;
            } else {
                break;
            }
        }
        return i == -1 && j == -1;
    }
}
