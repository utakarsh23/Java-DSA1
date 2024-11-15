// Code for showing error "ArrayIndexOutOfBoundsException"
public class plusindex {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        System.out.println(
            "Trying to access element outside the size of array");
        System.out.println(arr[5]);
    }
}
