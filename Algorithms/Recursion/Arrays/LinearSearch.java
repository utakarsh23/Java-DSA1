package Recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 8, 13, 13, 5, 9};
        List<Integer> lis = new ArrayList<>();
        System.out.println(searchTrueOrFalse(arr, 13, 0));
        System.out.println(search(arr, 13, 0));
        System.out.println(searchFromLast(arr, 13, arr.length-1));
        System.out.println(searchAllTargetElements(arr, 13, 0));
        System.out.println(searchAllTargetElements(arr, 8, 0, lis));
        System.out.println(searchAllTargetElementsNoArgs(arr, 13, 0));

    }

    //m1
    static int search(int[] arr, int target, int index) {
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        return search(arr, target, index+1);
    }

    //m2
    static boolean searchTrueOrFalse(int[] arr, int target, int index) {
        if(index == arr.length) return false;
        return arr[index] == target || searchTrueOrFalse(arr, target, index+1);
    }

    //m3
    static int searchFromLast(int[] arr, int target, int index) {
        if(index == -1) return -1;
        if(arr[index] == target) return index;
        return searchFromLast(arr, target, index-1);
    }

    //m4
    static List<Integer> li = new ArrayList<>();
    static List<Integer> searchAllTargetElements(int[] arr, int target, int index) {

        if(index == arr.length) return li;
        if(arr[index] == target) li.add(index);
        return searchAllTargetElements(arr, target, index+1);
    }

    //m5
    static List<Integer> searchAllTargetElements(int[] arr, int target, int index, List<Integer> lis) {
        if(index == arr.length) return lis;
        if(arr[index] == target) lis.add(index);
        return searchAllTargetElements(arr, target, index+1, lis);
    }

    //m6
    static List<Integer> searchAllTargetElementsNoArgs(int[] arr, int target, int index) {
        List<Integer> lis = new ArrayList<>();
        if(index == arr.length) return lis;
        if(arr[index] == target) lis.add(index);
        List<Integer> allFromAfterRecursionCalls = searchAllTargetElementsNoArgs(arr, target, index + 1); //recursion loop containing all the elements loop ever had, that's why we use AddAll function
        lis.addAll(allFromAfterRecursionCalls);
        return lis;
    }
}
