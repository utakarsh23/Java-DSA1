public class arrayprint {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 5, 6};
        arrindex(arr);
        System.out.println("*****");
        indexi(arr);
        System.out.println("*****");
        metarr2(arr);
    }
    public static void indexi(int[] arr) { // to print the indexing(orthe no of items) in the array #psvm(i)
        for(int i = 0; i < arr.length; i++)   { // here i is indentified for indexing of the array and we are printing i
            System.out.println(i);
            }
    }
    public static void arrindex(int[] arr) { //to print the elements in the array #psvm(arr[i])
        for(int i = 0; i < arr.length; i++)   { // here arr[i] is indentified for elemnts at index of the array and we print elements
            System.out.println(arr[i]);
            }
    }
    public static void metarr2(int[] arr) { //to print the elements in the array 
        for(int value: arr) {
            System.out.println(value);
        }
    }
}