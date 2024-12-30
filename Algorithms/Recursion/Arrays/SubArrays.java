package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArrays {
    public static void main(String[] args) {
        int[] adr = {1, 2, 3, 4};
        System.out.println(subseq(adr));
    }
    static List<List<Integer>> subseq(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int x: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(x);
                outer.add(internal);
            }
        }
        return outer;
    }
}
