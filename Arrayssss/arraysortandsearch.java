import java.util.Arrays;
public class arraysortandsearch {
    public static void main(String[] args) {
        int[] arr = {10, 63, 30, 40, 56, 66, 79};
        Arrays.sort(arr); //here array.sort is used to sort the array
        int intkey = 30; //intkey is used to story the value of the element to be searched
        System.out.println("Found at Index : " + Arrays.binarySearch(arr, intkey)); //Array.binarySearch(Array, element to be searched) is used to search the element in the array
    }
}
