package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortVovelsInAString {
    public static void main(String[] args) {
        System.out.println(sortVowels("eliYmpHa"));
    }
    static String sortVowels(String s) {
        char[] ch = s.toCharArray();
        String vov = "aeiouAEIOU";
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int i = 0;
        List<Character> li = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for (int k = 0; k < ch.length; k++) {
            if(vov.indexOf(ch[k]) != -1) {
                li.add(ch[k]);
                index.add(k);
            }
        }
        Collections.sort(li);
        for (int k : index) {
            ch[k] = li.get(i);
            i++;
        }
        return new String(ch);
    }
}
