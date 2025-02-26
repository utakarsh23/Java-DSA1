package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindWordContainingChar {
    public static void main(String[] args) {
        String[] words = {"leet","code"}; char x = 'e';
        System.out.println(findWordsContaining(words, x));
    }

    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> li = new ArrayList<>();
        int i = 0;
        for(String s : words) {
            for(char ch : s.toCharArray()) {
                if(ch == x) {
                    li.add(i);
                    break;
                }
            }
            i++;
        }
        return li;
    }
}
