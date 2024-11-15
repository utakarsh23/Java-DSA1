public class twodimarray {
    public static void main(String[] args) {
        int row = 4;
        int column = 4;
        int[][] arr = new int[row][column];
        int value = 1;
        for(int i = 0; i< row;i++) {
            for(int j = 0; j < column; j++) {
                arr[i][j] = value; //giving a[i][j](index of the array) the value to be printed(1->2->3->4)
                value++; //increasing the value with every index
            } //in the loop for i = 0; j = 0, 1, 2, 3; i = 1; j = 0, 1, 2, 3; i = 2; j = 0, 1, 2, 3; i = 3; j = 0, 1, 2, 3;
            //and value at i->[0] & j->[0] then value is 1 & value at i->[1] & j->[1] then value is 2 and so on
        }
        System.out.println("The 2D Array is : "); //printing the 2D array
        for(int i = 0; i< row;i++) { //loop for rows
            for(int j = 0; j < column; j++) { //loop for columns
                System.out.print(arr[i][j] + " "); //printing the 2D arrayw without any new line after each value of i and all values of j
            }
            System.out.println(); //to give space after each i value
        }
    }
}
