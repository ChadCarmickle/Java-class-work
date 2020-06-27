	
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
		
//File stream 
public class Assignment_1_RandomNumber {

	
	public static void main(String[] args) throws FileNotFoundException  { 
		File file = new File("17.1.txt"); 
	
		//Writing to file 	
		PrintWriter output = new PrintWriter(file);  // Creating the object 

		//Making a few int 
		output.println("  - Random Numbers -  "); 
		int Counter = 10;  //Counter to seperate lines
		
		int B50 = 0;  			 // B50 = below 50 
		int A50 = 0;  			// A50 = Above 50
		int One_Hundred = 0;   //  
		for(int i = 0; i < 101; i++) { 
			int T = (int) (Math.random()* 101); 
		
			 
			output.print(" " + T + " "); 
 

			
			   if (i == Counter) { 
					output.print(" " + System.lineSeparator() + " "); 
			   Counter = Counter + 10; 
			   } 
			   else if (T < 50) { 
					B50++; 
				}
				else if (T > 50)  {
					A50++; 
				}
				else if (T == 100) { 
					One_Hundred++; 
				}
			   
		}
		output.print(" " + System.lineSeparator() + " "); 
		output.print("There were " + B50 + " numbers below 50"); 
		output.print(" " + System.lineSeparator() + " "); 
		output.print(" And  " + A50 + " numbers above 50 "); 
		output.print(" " + System.lineSeparator() + " "); 
		output.print(" Also, the number 100 was seen  " + One_Hundred + " times"); 

			output.close(); // *** Dont forget to close the output or a memmory leak can occur***
	
	 


// The file is made now lets have the console read it. 
	
		// have to cover it in try / catch to pervent any execptions poping up 
		try { 	
			Scanner input = new Scanner(file);  // Scanner to read the file 


			
			String Line1 = input.nextLine(); // Line 20 Question 3 
			int B_50 = 0; //Number below 50
			int A_50 = 0;  // Number above 50 
		
			System.out.println("Random Numbers" );
			System.out.println();	
			
		for(int i = 0; i < 101; i++) {
			int R = (int) (Math.random()* 101); 
		
			System.out.print(R + " ");
			
			   if (i == 30) { 
					System.out.print(" " + System.lineSeparator() + " ");
			   }
			   else if (i == 61) { 
					System.out.print(" " + System.lineSeparator() + " ");				   
			   }
			   else if (i == 91) { 
					System.out.print(" " + System.lineSeparator() + " ");				   
			   }
			
			   else if (R < 50) { 
					B_50++; 
				}
				else if (R > 50)  {
					A_50++; 
				}
			
		}
		System.out.println();
		System.out.println("There were: " + B_50 + " Numbers below 50");
		System.out.println();
		System.out.println("and: " + A_50 + " Numbers Above 50");

		}
		
		// If Exectpion is found this will print 
		catch (FileNotFoundException ex) { 
			System.out.println("File not found");
		}
	 
	}
}
