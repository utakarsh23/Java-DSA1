
import java.util.Arrays;

public class clonearr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone(); //cloning the array
        System.out.println(arr1 == arr2); //checking if clone is equal to original array method 1
        //output is false because the copy(arr2) of object array is not the original(arr) one, only it's data is copied/cloned that is why the output is false 
        System.out.println(arr1.equals(arr2)); //checking if clone is equal to original array method 2
        /*
        1. In this example, intArray and cloneArray are not the same object (intArray == cloneArray is false), but they share the same contents because primitive values are deeply copied.
        2. For arrays containing objects, the references are copied, so the objects themselves are not duplicated.*/
        System.out.println(Arrays.equals(arr1, arr2)); //here it is comparing the arrays by their elements not the objects, so true
        System.out.println("arr1  arr2"); 
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(" " + arr1[i] + "      " + arr2[i]);
        }
    }
}
