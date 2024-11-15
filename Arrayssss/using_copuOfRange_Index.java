
import java.util.Arrays;

public class using_copuOfRange_Index {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        System.out.println(Arrays.toString(arr));
        System.out.println("new arrays by copy ofRange");
        System.out.println("Integer Array : " + Arrays.toString(Arrays.copyOfRange(arr, 1, 4)));
        //copy of range is used to copy the array from index 1 to index 3
    }
}
