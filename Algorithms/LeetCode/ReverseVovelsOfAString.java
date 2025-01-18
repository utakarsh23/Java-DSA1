package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVovelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels(
                "leetcode"
        ));
    }
    //kinda brute force and unhygenic
//    static char[] reverseVowels(String s) {
//        char[] ch = s.toCharArray();
//        int i = 0;
//        int j = ch.length-1;
//        char[] vo = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
//        List<Character> vov = new ArrayList<>();
//        for (int k = 0; k < vo.length; k++) {
//            vov.add(vo[k]);
//        }
//        while (i < j) {
//            if(!vov.contains(ch[i])) {
//                i++;
//            }
//            if(!vov.contains(ch[j])) {
//                j--;
//            }
//            if(vov.contains(ch[i]) && vov.contains(ch[j])) {
//                swap(ch, i, j);
//            }
//            i++;
//            j--;
//
//        }
//        return ch;
//    }
//    static void swap(char[] ch, int i, int j) {
//        char temp = ch[i];
//        ch[i] = ch[j];
//        ch[j] = temp;
//    }
    static String reverseVowels(String s) {
        int i = 0;
        int j = s.length();
        char[] ch = s.toCharArray();
        String vovels = "aeiouAEIOU";
        while(i < j) {
            while(i < j && vovels.indexOf(ch[i]) == -1) {
                i++;
            }
            while(i < j && vovels.indexOf(ch[j]) == -1) {
                j--;
            }
            swap(ch, i, j);
            i++;
            j--;

        }
        return ch.toString();
    }
    static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
