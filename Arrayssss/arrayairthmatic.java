public class arrayairthmatic {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; //giving elements to the array
        sum(arr);
    }
    public static void sum(int arr[]) { //defining the function
        int sum = 0; //initializing the sum
        for(int i = 0; i < arr.length; i++) { //here i is taken for the index of elements in the array
            sum = sum+arr[i]; //sum of arrays
        }
        System.out.println(sum);  //after the loop, total sum is printed
    }
}
