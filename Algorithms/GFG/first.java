package GFG;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int arr[] = {3, 5, 0, 0, 4};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int getSecondLargest(int[] arr) {
        int i = arr.length-1;
        while(i > 0) {
            if(arr[i-1] != arr[i]) {
                return arr[i-1];
            }
            i--;
        }
        return -1;
    }


    static void pushZerosToEnd(int[] arr) {
        int k = 0;
        for (int i = k; i < arr.length-1; i++) {
            for (int l = i; l < arr.length-1; l++) {
                if(arr[l] == 0) {
                    int temp = arr[l];
                    arr[l] = arr[l+1];
                    arr[l+1] = temp;
                }
                if(arr[l] == 0 && arr[l+1] == 0) {
                    k = l-1;
                }
            }
        }
    }
}
