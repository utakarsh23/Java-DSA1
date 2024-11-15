
public class maximun_elements1 {
    public static void main(String[] args) {
        int[] arr = {102, 1, 4, 6, 8, 9, 45, 36, 67, 90, 56, 12, 100};
        System.out.println(maxim(arr, 2, 5)); //print
    }

    static int maxim(int[] arr, int start, int end) {  //method 1
        int max = arr[start]; //letting the forst one to be index 0
       for(int i = start; i< end; i++) { //loop for each element except 0th index(as it is already defined)
            if(arr[i] > max) { //if arr[i] > max, then max will be changed to arr[i] 
                max = arr[i]; //here
            }
       }
       return max; //returning the integer
    }
}
