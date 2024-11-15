import java.util.Arrays;
public class arraybinsearch {
    public static void main(String[] args) {
        int[] arr = {10, 63, 30, 40, 56, 66, 79};
        Arrays.sort(arr); //here array.sort is used to sort the array
        int sear = 30; //intkey is used to story the value of the element to be searched
        System.out.println(sear + " Found at Index : " + Arrays.binarySearch(arr, 1, 3, sear)); //here the Arrays.binarySrearch(Array, start index, end index, element to be searched) is used to search the element in the array
    }
}
