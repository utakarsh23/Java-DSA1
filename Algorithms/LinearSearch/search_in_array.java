package LinearSearch;

public class search_in_array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4 , 5, 6, 6, 6, 7, 8, 89, 5, 4, 3, 34, 5, 56, 6};
        int target = 89;
        /* checking for only true statements */
        System.out.println(linear_search(arr, target)); //index printing
        System.out.println("");
        System.out.println(linear_search1(arr, target)); //element printing
        System.out.println("");
        System.out.println(linear_search2(arr, target)); //boolean(if exists) printing
        System.out.println("----------------");
        int target1 = 899;
        /* checking for only true statements */
        System.out.println(linear_search(arr, target1)); //index printing
        System.out.println("");
        System.out.println(linear_search1(arr, target1)); //element printing
        System.out.println("");
        System.out.println(linear_search2(arr, target1)); //boolean(if exists) printing
    }
    //func to return the index of the occured element
    static int linear_search(int[] arr, int target) { 
        if(arr.length ==0) { //if the array is empty then returning '-1'
            return Integer.MAX_VALUE;
        }
        for(int index = 0;index < arr.length; index++) { //checking in te array 
            int element = arr[index]; //element = aee[0], arr[1], arr[2]...,arr[length-1] 
            if(element == target) { //if arr[index] equals to the target then it will return the index, 
                return index; 
            }
        }
        return Integer.MAX_VALUE; //// this line will execute if none of the return statements above have executed
        // hence the target not found
    }
    //func to return the element itself on occurance
    static int linear_search1(int[] arr, int target) { 
        if(arr.length ==0) { //if the array is empty then returning '-1'
            return Integer.MAX_VALUE;
        }
        for (int element : arr) { //look checking every in te array till it's found 
            if(element == target) { //if arr[index] equals to the target then it will return the element itself, 
                return element; 
            }
        } //Integer.MAX_VALUE is used to  pick any random value of integer 
        return Integer.MAX_VALUE; //// this line will execute if none of the return statements above have executed
        // hence the target not found
    }
    //func to return the element itself is present or not
    static boolean linear_search2(int[] arr, int target) { 
        if(arr.length ==0) { //if the array is empty then returning 'false'
            return false;
        }
        for(int index = 0;index < arr.length; index++) { //look checking every in te array till it's found 
            int element = arr[index]; //element = aee[0], arr[1], arr[2]...,arr[length-1] 
            if(element == target) { //if arr[index] equals to the target then it will return the element itself, 
                return true; 
            }
        }
        return false; //// this line will execute if none of the return statements above have executed
        // hence the target not found
    }
}