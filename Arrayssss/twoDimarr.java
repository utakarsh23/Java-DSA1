public class twoDimarr {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2,3,4}, {4,5,6,8}, {7,8,9,10}}; //rows and then coumns
        System.out.println("Rows : " +arr.length); //no of rows(first beacket) {{},{},{}}
        System.out.println("Columns : " + arr[0].length); //no of columns(elements in bracket) {{1,2,3,4},{4,5,6,8},{7,8,9,10}}
        for(int i = 0; i< arr.length; i++) { //loop for rows
            for(int j = 0; j < arr[0].length; j++) { //loop for columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}