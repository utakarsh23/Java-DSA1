import java.util.Arrays;

public class spliterator {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35}; 
        System.out.println("Integral Array : " + Arrays.spliterator(arr)); 
        //Integral Array : java.util.Spliterators$IntArraySpliterator@200a570f
        //Arrays.spliterator is used to get the spliterator of the array
        System.out.println("Integral Array : " + Arrays.spliterator(arr, 1, 3)); 
    }   //Arrays.spliterator is used to get the spliterator of the array from index 1 to index 3
}