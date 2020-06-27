import java.util.Scanner;								// importing the Scanner 

public class SmallestElement_and_SmallestIndexElement {

	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); // Using the Scanner
			double[] Usernumbers = new double[10]; // Createing an array with the length of 10

			// Prompting the user to enter ten numbers
			System.out.print("Enter ten numbers: ");
			for (int i = 0; i < Usernumbers.length; i++) {
				Usernumbers[i] = input.nextDouble();
			}

			// Display the minimum value of those ten values that are entered 
			System.out.println("The minimum number is: " + min(Usernumbers));
		
			
			// Display the smallest value
			System.out.println("The minimum number is " + 
				Usernumbers[indexOfSmallestElement(Usernumbers)] + " index " +
				indexOfSmallestElement(Usernumbers));
			
		}

		// Creating a array method that will be called to find min number
	public static double min(double[] array) {
			double min = array[0];	// The minimum value
			for (double i: array) {
				if (i < min)
					min = i;
			}
			return min;
		}
	
		//Creating a second method that will find the smallest index of the number 
	public static int indexOfSmallestElement(double[] array) {
		if (array.length <= 1)   // checks the length is less than or equal to 1 
			return 0;
		
		double min = array[0];  // setting the min array to 0 
		int minimumIndex = 0;  // setting the min index to 0 
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];		// set min array to i (the counter) 
				minimumIndex = i;	// set min index to 0 
			}
		}
		return minimumIndex;  		// return the min of index 
	}	
}
