import java.util.Arrays;
public class arrayclass {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; //giving elements to the array
        System.out.println("array as list : " + Arrays.asList(arr)); //asList() method converts an array to a fixed-size List. It returns a List backed by the original array, meaning any modifications to the array will reflect in the List
        //(It treats the whole array as a single element)
    }
}
