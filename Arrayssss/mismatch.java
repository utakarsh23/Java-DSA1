
import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35}; //array one to be compared with
        int[] arr1 = {10, 15, 22}; //arrau two that is to be compared 
        System.out.println("mismatch at index : " + Arrays.mismatch(arr, arr1)); //comparing by elements usings Arrays.mismatch(arr, arr1)
    } //here elements are compared by index and the first mismatch is returned
}