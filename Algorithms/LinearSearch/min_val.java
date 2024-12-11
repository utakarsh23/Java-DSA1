package LinearSearch;

import java.util.Arrays;
public class min_val {
    public static void main(String[] args) {
        int[] arr = {230, 450, 660, 78, 98, 43, 120, 60, 74, -26, 90};
        System.out.println(min(arr)); //m1
        //m2
        Arrays.sort(arr); //sorting the array as it will get the smallest element at index 0
        System.out.println(arr[0]); //printing after sorting
    }
    private static int min(int[] arr) { //func for returning min value of the array || m1
        if(arr.length ==0) {
            return Integer.MAX_VALUE;
        }
        int min_ = arr[0]; ///initialising min value to the 0th index element
        for(int i = 1; i< arr.length; i++) { //loop for going through all elelements  
            if(arr[i] < min_) { // if arr[i] < min value, then min value will take it's place
                min_ = arr[i]; //here
            }
        }
        return min_; //returning the output of the array
    }
}
