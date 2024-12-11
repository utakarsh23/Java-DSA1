package LinearSearch;//ques to search elements inside a 2D arrray!!
import java.util.Arrays;
public class arraySearch2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5},
            {45, 56, 74, 34},
            {45, 23, 43, 49, 67},
            {30, 12}
        }; //2D array
        int[] ans = search(arr, 74);//storing into an array instead of int as it has two values,and we want both(explanation below)
        System.out.println(Arrays.toString(ans)); //Arrays.toString for printing the array into an readable format and rep as a string
    } //sout(ans) -> [I@123772c4 will give this output which isn't readable
    static int[] search(int arr[][], int target) { //retur type int[] instead of int as we want the index which can't be printed  with 
    //just single return
        for(int row = 0; row < arr.length; row++) { //row loop(0, 1, 2, 3)
            for(int col = 0; col < arr[row].length; col++) { //col loop 0(0, 1, 2), 1(0, 1, 2, 3), 2(0, 1, 2, 3, 4), 3(0, 1) || row(col)
                int element = arr[row][col]; //element = arr[row][col], where it will give each element of the row and column
                if(element == target) { //consitional statement if element equals to the target or not..
                    return new int[] {row, col}; ///returning an array as we have to print both row & col,
                } //we can't just return  row, col or row + "" + col; as first one is invalid and sec is a string;
            }
        }
        return new int[] {-1, -1}; //returning [-1, -1] id array does not contain the target
    }
}
