package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class N_AndItsDouble {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist1(arr));
    }

    //brute force
    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j) continue;
                if(arr[i] == 2*arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkIfExist1(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
