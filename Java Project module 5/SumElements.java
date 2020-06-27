import java.util.Scanner;
public class SumElements {

	//Main program start point 
	public static void main(String[] args) {

			
	// Reads a 3-by-4 Grid 
			double[][] Board = getBoard();

			
	// Outputing the sum of each column that is listed
			for (int k = 0; k < Board[0].length; k++) {	
				System.out.println(
					"Sum of the elements at column " + k + 
					" is " + sumColumn(Board, k));
			}
}

	public static double[][] getBoard() {
			// Createing a Scanner to gain the users input to create a 3x4 column 
			
		Scanner input = new Scanner(System.in);
			
			final int ROWS = 3;			//Defining Rows 
			final int COLUMNS = 4;		//Definding Columns 
			double[][] m = new double[ROWS][COLUMNS];

			
			// Prompt the user to enter a 3-by-4 Column
			System.out.println("Enter a " + ROWS + "-by-" + 
				COLUMNS + " Board row by row:");
			for (int i = 0; i < m.length; i++)
				for (int col = 0; col < m[i].length; col++) 
					m[i][col] = input.nextDouble();
			return m;
		}

		// Return the sum of the elemts in columnIndex from what user entered 
		public static double sumColumn(double[][] m, int columnIndex) {
			double sum = 0;
			for (int row = 0; row < m.length; row++) {
				sum += m[row][columnIndex];		
			}
			return sum;
		}
	}