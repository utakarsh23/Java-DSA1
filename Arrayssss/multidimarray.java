public class multidimarray {
    public static void main(String[] args) {
        int arr[][] = {{1, 4, 6}, {3, 7, 9}}; /*defining multi dim array by giving two '[][]' and defining the
                                              elements in the array with teo curly brackets {{},{}} */
        for (int i = 0; i < 2; i++) { //here i is for the no of brackets(rows if martix)
            for(int j = 0; j < 3; j++) {  //here j is for the no of elements in each bracket(column if martix)
                System.out.print(arr[i][j] + " "); 
                /* here j(element of row) is printed for each value of i(ie. i = 0(1st indexed row(1, 2, 3)) and j = 0(1st value in i^th indexed row(1)) then j = 1(2nd value in i^th indexed row(4)) and j = 2(3rd value in i^th indexed row(6))) */
                //and then same for i = 1(2nd indexed row(3, 7, 9))
            }
            System.out.println(""); // it is to give a new line after each iteration of i
        }
    }
}
