package LeetCode;

import java.util.Arrays;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "abcdhjhjhh", word2 = "pqruo";
        System.out.println(mergeAlternately(word1, word2));
    }
    static String mergeAlternately(String word1, String word2) {
        char[]  wordd1 = word1.toCharArray();
        char[]  wordd2 = word2.toCharArray();
        char[] ch = new char[wordd1.length+ wordd2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < wordd1.length && j < wordd2.length) {
            ch[k++] = wordd1[i++];
            ch[k++] = wordd2[j++];
        }
        if(i < wordd1.length) {
            for (int l = i; l < wordd1.length; l++) {
                ch[k++] = wordd1[i++];
            }
        }
        if(j < wordd2.length) {
            for (int l = j; l < wordd2.length; l++) {
                ch[k++] = wordd2[j++];
            }
        }
        String sh = "";
        for (int l = 0; l < ch.length; l++) {
            sh += ch[l];
        }
        return sh;
    }
}
