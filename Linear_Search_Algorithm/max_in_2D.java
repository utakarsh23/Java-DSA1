//maximum inside a 2D array
public class max_in_2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5},
            {45, 56, 74, 34},
            {45, 23, 43, 49, 67},
            {30, 12}
        }; //2D Array
        System.out.println(max(arr));
    }
    static int max(int arr[][]) { //func to pluck out the maximum inside of a 2D Array
        int maxx = arr[0][0];  //MAX INITIALISATION WITH ARR[0][0] -> '1'
        for(int row = 0; row < arr.length; row++) {  //ROW LOOP
            for(int col = 0; col < arr[row].length; col++) {  //COUMN LOOP || arr[row].legth -> it gives length of current row;
                if(arr[row][col] > maxx) { // CONDITION, IF ARR[ROW][COL] > MAXX, THEM 'maxx' WILL TAKE THE VALUE OF ARR[ROW][COL]
                    maxx = arr[row][col]; //HERE
                }
            }
        }
        return maxx; //RETURNING THE MAXIMUM OF THE ARRAY
    }
}
