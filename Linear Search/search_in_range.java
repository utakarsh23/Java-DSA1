public class search_in_range {
    public static void main(String[] args) {
        int[] arr = {34, 45, 67, 89, 65, 43, 32, 25, 57, 79};
        System.out.println(linear_search1(arr, 67, 1, 5));
    }
    static int linear_search1(int[] arr, int target, int start, int end) { 
        if(arr.length ==0) { //if the array is empty then returning '-1'
            return Integer.MAX_VALUE;
        }
        for (int index = start; index < end; index++) { //look checking every in te array till it's found 
            int element = arr[index];
            if(element == target) { //if arr[index] equals to the target then it will return the element itself, 
                return index; 
            }
        } //Integer.MAX_VALUE is used to  pick any random value of integer 
        return Integer.MAX_VALUE; //// this line will execute if none of the return statements above have executed
        // hence the target not found
    }
}