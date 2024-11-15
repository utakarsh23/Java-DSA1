import java.util.Arrays;

public class maximun_elements {
    public static void main(String[] args) {
        int[] arr = {102, 1, 4, 6, 8, 9, 45, 36, 67, 90, 56, 12, 100};
        max(arr);
        System.out.println(max(arr)); //print
        Arrays.sort(arr); //method 2, when we sort the array we sort it by the value, so it is to be taken that the last index
        //should be the largest value.
        System.out.println(arr[arr.length-1]); //arr[arr.length-1], it gives the element at last index of the array 
    }

    static int max(int[] arr) {  //method 1
        int max = arr[0]; //letting the forst one to be index 0
       for(int i = 1; i< arr.length; i++) { //loop for each element except 0th index(as it is already defined)
            if(arr[i] > max) { //if arr[i] > max, then max will be changed to arr[i] 
                max = arr[i]; //here
            }
       }
       return max; //returning the integer
    }
}
