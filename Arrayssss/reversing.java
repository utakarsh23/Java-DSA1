import java.util.Arrays;

public class reversing { 
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5 ,6, 6, 7, 8 ,9, 0, 24, 6};
        reverse(arr); //getting the result
    }
    public static void reverse(int arr[]) {
        for(int in = 0; in< arr.length/2; in++) { // a loop that will run by half as we have to stop swapping elements when it is in 
            //middle else it will return the origina;l string 
            int temp = arr[in]; //temp = arr[0], temp = arr[1], temp = arr[2]....
            arr[in] = arr[arr.length-in-1]; //(arr.length-1 -> last index ->x) //arr[0] = arr[x-0], arr[1] = arr[x-1]...
            arr[arr.length-in-1] = temp;  //arr[x-0] = arr[0], arr[x-1] = arr[1]..
        }
        System.out.println(Arrays.toString(arr)); //printing
    }
}
