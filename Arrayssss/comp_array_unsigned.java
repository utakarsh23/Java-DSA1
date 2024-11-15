
import java.util.Arrays;

public class comp_array_unsigned {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        int[] arr1 = {10, 15, 22};
        System.out.println("Integral Arrays on Comparision : " + Arrays.compareUnsigned(arr, arr1));
        //here the Arrays.compareUnsigned(arr, arr1) is used to compare the unsigned arrays, as it says unsigned, it does not give output of negative sign(usually java int type holds both negative and positive integers but here it just holds 0 & positive integers)
        //still if comes the case that arr[i] < arr1[i] then it gives output as -1
        // int[] arr = {10, 20, 15, 22, 35};
        // int[] arr1 = {10, 23, 22};           
    }
}
