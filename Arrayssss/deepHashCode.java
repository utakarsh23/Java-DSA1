
import java.util.Arrays;
//deep{<Method>} basically checks every element(either if nested or multi dimentional array) that is in the array so it can only be used for Multi-Dimentional Arrays, while normal {<method>} is used for one dimentional arrays as they don't have nester arrays or does not need to check tne elements of the array as there is only one array
public class deepHashCode {
    public static void main(String[] args) {
        int arr[][] = {{10, 20, 15, 22, 35}}; //multi dim array
        int arr1[] = {10, 20, 15, 22, 35}; //deepHashCode is not applicable to one dim Array, so we use Arrays.hashCode
        String[] arr2 = {"Utkarsh", "Shaurya", "Dhruv", "Ayush", "Yashika"};
        System.out.println(Arrays.deepHashCode(arr));
        //here the Arrays.deepHashCode(arr) is used to get the hashcode of the array
        System.out.println(Arrays.hashCode(arr1)); 
        System.out.println(Arrays.hashCode(arr2));
    }
}