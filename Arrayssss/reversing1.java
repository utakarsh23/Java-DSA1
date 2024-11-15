import java.util.Arrays;
// two pointer method
public class reversing1 {
    public static void main(String[] args) {
        int[] arr = {34, 67, 33, 56, 78, 77, 85, 75};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) { //func to rveerse
        int start = 0; //start from 0th index
        int end = arr.length-1; //end starts from last index
        while(start<end) { //if start < end -> --- || start !< end: ie. indexing have reached the middle of the array;  
            swapss(arr, start, end); //swap func--> explained in fucn itself
            start ++; //increasing starting index by one
            end--; //decreasing ending index by one

        }
    }
    public static void swapss(int arr[], int index1, int index2) { //function to swap array || arr, i1 = 34, i2 = 75 | 67, 85 | 33, 56 |..
        int temp = arr[index1]; //temp == 34, 67, 33...
        arr[index1] = arr[index2]; //i1 = 75, 85, 77...
        arr[index2] = temp; //i2 = 34, 67, 33...
    }
}
