
import java.util.Arrays;

public class fillmethod {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        int intkey = 27; //defining which number to change the elemebnts with
        Arrays.fill(arr, intkey); //fill method is used to fill the array with given value Arrays.fill(Array, value to be filled)
        System.out.println(Arrays.toString(arr)); //printing the new array using Arrays.toString(arr)
        Arrays.fill(arr, 1, 3, intkey+2); //fill method is used to fill the array with given value Arrays.fill(Array, start index, end index, value to be filled)
        System.out.println(Arrays.toString(arr));
    }
}