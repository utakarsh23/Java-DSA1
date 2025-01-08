package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public static void main(String[] args) {
        String ss[] = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(ss));
    }
    static List<String> stringMatching(String[] words) {
        List<String> ss = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].contains(words[j])) {
                    ss.add(words[j]);
                }
            }
        }
        for (int i = words.length-1; i >0; i--) {
            for (int j = words.length-1-i; j >=0; j--) {
                if(words[i].contains(words[j]) && !ss.contains(words[j])) {
                    ss.add(words[j]);
                }
            }
        }
        return ss;
    }
}
