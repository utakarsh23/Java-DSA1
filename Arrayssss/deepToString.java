
import java.util.Arrays;

public class deepToString {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}};
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr)); //deep top string converts multi dimentional array to string
        System.out.println(Arrays.deepToString(arr1));
    }
}
