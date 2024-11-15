import java.util.Arrays;
public class arraysort {
    public static void main(String[] args) {
        int[] arr = {10, 63, 30, 40, 56, 66, 79};
        int arr1[] = {10, 63, 30, 40, 56, 66, 79};
        Arrays.sort(arr, 1, 3); //here array.sort is used to sort the array from index 1 to index 3
        Arrays.sort(arr1); //here array.sort is used to sort the array without any consition
        System.out.println(Arrays.toString(arr)); //printing the new array using Arrays.toString(arr)
        System.out.println(Arrays.toString(arr1)); //printing the new array using Arrays.toString(arr1)
    }
}
