
import java.util.Arrays;

public class using_copyof {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        System.out.println(Arrays.toString(arr)); //printing arrays into single line as strings
        System.out.println("new arrays by copy of method"); //a simple space and text haha
        System.out.println("Integer Arrays : " + Arrays.toString(Arrays.copyOf(arr, 10)));
        //here the Array.toString is used to make a String of the array and Arrays.copyOf(arr, length of new array) is used to copy the array into the new array of the length specified`
    }
}
