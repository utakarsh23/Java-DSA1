public class index2darray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6, 8}};
        for(int i = 0; i< arr.length; i++) { //to give the imdexing idea  about the array and the value assigned to it
            for(int j = 0; j< arr[1].length; j++) 
            System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]); //index(i) + index(j) = value at index [i][j]
        }
        for(int i = 0; i< arr.length; i++) { //printing the array 
            for(int j = 0; j< arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}