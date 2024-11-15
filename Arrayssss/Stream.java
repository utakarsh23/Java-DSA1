import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35}; 
        System.out.println("Integral Array : " + Arrays.stream(arr)); 
        //Integral Array : java.util.stream.IntPipeline$Head@3ada9e37
        //Arrays.spliterator is used to get the stream of the array
        System.out.println("Integral Array : " + Arrays.stream(arr, 1, 3)); 
    }   //Arrays.spliterator is used to get the stream of the array from index 1 to index 3
}