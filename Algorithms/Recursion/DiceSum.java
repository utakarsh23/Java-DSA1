package Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceSum {
    public static void main(String[] args) {
        System.out.println(dice1("", 4));
    }
    static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target-i);
        }
    }

    static List<String> dice1(String p, int target) {
        if(target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> str = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            str.addAll(dice1(p + i, target-i));
        }
        return str;
    }
}
