import java.util.Arrays;

public class swapski {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35}; //arrray
        System.out.println(Arrays.toString(arr)); //array before swapping 
        swapss(arr, 1, 4); //array swap index 1(20) with 4(35)
        System.out.println(Arrays.toString(arr)); //print
    }
    public static void swapss(int arr[], int index1, int index2) { //function to swap array || arr, i1 = 20, i2 = 35
        int temp = arr[index1]; //temp == 20
        arr[index1] = arr[index2]; //i1 = 35
        arr[index2] = temp; //i2 = 20
    }
}
