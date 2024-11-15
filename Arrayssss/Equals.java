
import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        int[] arr1 = {10, 20, 15, 22, 35};
        System.out.println(Arrays.equals(arr, arr1)); //true //here it is comparing the arrays
        // false if we have used arr == arr1 or arr.equals(arr1)
    }
}
