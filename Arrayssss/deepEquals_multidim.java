import java.util.Arrays;
public class deepEquals_multidim {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 15, 22, 35}}; //multi dim array
        int[][] arr1 = {{10, 20, 15, 22, 35}}; //multi dim array 
        int[][] arr2 = {{10, 20, 15}};
        System.out.println(Arrays.deepEquals(arr, arr1)); //true //comparing multi dimentional arrays using Arrays.deepEquals(arr, arr1)
        System.out.println(Arrays.equals(arr, arr1)); //falsee in this case because .equals check the object but deepEquals checl the 
        //element of the arrays
        System.out.println(Arrays.deepEquals(arr, arr2)); //false as they are not equal
    }
}
