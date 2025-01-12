package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(47, 85));
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if(helperFunc(i)) {
                list.add(i);
            }
        }
        return list;
    }
    static boolean helperFunc(int a){
        String c = a+"";
        List<Character> set = new ArrayList<>();
        for (int i = 0; i < c.length(); i++) {
            set.add(c.charAt(i));
        }
        if(set.contains('0')){
            return false;
        }
        for (int i = 0; i < set.size(); i++) {
            if(a%(set.get(i)-'0') != 0) {
                return false;
            }
        }
        return true;
    }
}
