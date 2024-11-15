
import java.util.Arrays;

public class parallelsort {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        Arrays.parallelSort(arr); //here data is sorted in parallel(the data first divided into chunks and then sorted in parallel) so the time is reduced as compared to normal sort
        System.out.println(Arrays.toString(arr)); //printing the sorted array using Arrays.toString
    }
}