package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void duplicateZeros(int[] arr) {
        List<Integer> li = new ArrayList<>();
        for (int i : arr) {
            li.add(i);
            if(i == 0) {
                li.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = li.get(i);
        }
    }



    static void duplicateZeros1(int[] arr) {
        var copy = arr.clone();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = copy[j];
            if(copy[j] == 0 && i < arr.length - 1) {
                i++;
                arr[i] = 0;
            }
            j++;
        }

    }

}
