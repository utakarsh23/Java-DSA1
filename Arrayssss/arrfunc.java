public class arrfunc {
    public static void main(String[] args) {
        int[] arr = m1(); //assigning m1 as the role of the arr
        for(int i = 0; i< arr.length; i++){ //loop to print the elements of the array
        System.out.print(arr[i] + " "); //printing hahaha
        //--------------------------------------------------------------------
    }
}
    public static int[] m1() {
        return new int[] {1, 3, 2, 4, 5}; //returning the array while 'new' keyword is used to create the array
    }   
}
