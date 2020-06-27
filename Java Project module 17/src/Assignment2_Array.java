	
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Date;


//File stream 
public class Assignment2_Array {

	
	public static void main(String[] args) throws FileNotFoundException  { 
		File file = new File("17.6.txt"); 


// The file is made or updated, the file is now read through console 
	
			
			Scanner input = new Scanner(file);  // Scanner to read the file 
			
			String Intro = input.nextLine();  // The Begening text 
			
			int E0 = input.nextInt(); // Creating 5 objects to catch each int
			int E1 = input.nextInt();
			int E2 = input.nextInt();
			int E3 = input.nextInt();
			int E4 = input.nextInt();
			
			int[] Console_array = {0,0,0,0,0};   // The array 				

			Console_array[0] = E0;
			Console_array[1] = E1;
			Console_array[2] = E2;
			Console_array[3] = E3;
			Console_array[4] = E4;

			
			System.out.println(Intro);	// Prints the first line 			
		for(int i = 0; i <= 4; i++) { 	
			System.out.println(Console_array[i]);
		}
			Date Console_Date = new Date();
			
			String Line = input.nextLine();
			String Line2 = input.nextLine();
			String Line3 = input.nextLine();
			double Console_Decimal = input.nextDouble(); 

			System.out.println(Console_Date); // Then the date 
			System.out.println(Line); 	// Catches line 1  
			System.out.println(Line2); 	// Then line 2   
			System.out.println(Line3); 	// Then line 3  
			System.out.println(Console_Decimal); 	// Line for the decimal  

	}
}
