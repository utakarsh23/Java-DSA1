package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNo {
    public static void main(String[] args) {
        System.out.println(helperFuncCount("", "12"));
        helperFunc("", "12");
    }

    static void letterCombinations(String digits) {

    }

static void helperFunc(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        int dig = up.charAt(0)-'0';

        for (int i = (dig-1)*3; i < dig*3; i++) {
            char ch = (char)('a'+i);
            helperFunc(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> helperFunc1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int dig = up.charAt(0)-'0';
        ArrayList<String> ans  = new ArrayList<>();
        for (int i = (dig-1)*3; i < dig*3; i++) {
            char ch = (char)('a'+i);
            ans.addAll(helperFunc1(p+ch, up.substring(1)));
        }
        return ans;
    }

    static int helperFuncCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int dig = up.charAt(0)-'0';
        int count = 0;
        for (int i = (dig-1)*3; i < dig*3; i++) {
            char ch = (char)('a'+i);
            count = count + helperFuncCount(p+ch, up.substring(1));
        }
        return count;
    }
}
