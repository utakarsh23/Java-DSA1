
import java.util.Arrays;

public class comp_arrays {
    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 22, 35};
        int arr2[] = {9, 19, 14, 21, 34};
        System.out.println("Integer arrays on Comparision : " + Arrays.compare(arr, arr2)); //here it compared the values lexiographically, if the values are same it returns 0, if the first array is greater than the second array it returns 1, if the first array is smaller than the second array it returns -1 (index is seen of both the arrays), arr[0] == arr2[0] and arr[1] == arr2[1] and so on, but if arr[0] < arr2[0] then it returns -1 while arr[0] > arr2[0] it returns 1
    }
}
