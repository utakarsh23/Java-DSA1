import java.util.Scanner;

public class creating2D_Array {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = scan.nextInt(); //asking no of rows to be printed

		System.out.print("Enter number of columns: ");
		int columns = scan.nextInt(); //asking no of columns to be printed

		int[][] arr= new int[rows][columns]; //initialising size of the array

		// Now you can use the array like a regular
		// 2-dimensional array
        int value =1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j]= value;
                value++;
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j]+ " ");
			}

			System.out.println();
		}
		scan.close();
	}
}
