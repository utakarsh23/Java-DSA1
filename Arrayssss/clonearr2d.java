public class clonearr2d {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}};
        int[][] arr2 = arr.clone();
        System.out.println(arr == arr2); //false as only elements are copied not the real object 
        System.out.println(arr[0] == arr2[0]); //true because they both point st the same subarray (arr[0] --> {1, 2, 3} and arr2[0] --> {1, 2, 3})
        System.out.println(arr[1] == arr2[1]); //true because they both point st the same subarray (arr[1] --> {4, 5} and arr2[1] --> {4, 5})
    }
}
