	
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
		
//File stream 
public class Avatar {

	
	public static void main(String[] args)  { 
		File file = new File("Avatar_File.txt"); 
	
		//Writing to file 	
		
		
		//Blacked out the lines so the program can read what you typed in and answer 

		
		try { 	// Adding a try and catch block because it can cause an error
			
			PrintWriter output = new PrintWriter(file);  // Creating the object 
			output.println("  Water. Earth. Fire. Air. Long ago, the four nations  "); 
			output.println(" lived together in harmony. Then everything changed  "); 
			output.println(" when the Fire Nation attacked. Only the Avatar,     "); 
			output.println(" master of all four elements could stop them, but    "); 
			output.println(" but when the world needed him most, he vanished.    ");
		    output.println(" A hundred years passed and my brother Sokka and i	 "); 
			output.println(" and I discovered the  new Avatar, an airbender 	 ");
			output.println(" named Aang. Although his airbending skills          "); 
			output.println(" were great, he had a lot to learn before he was     ");					
			output.println(" was ready to save anyone...						 ");
			output.println("I believed Aang would save the world. "				  );
			output.println();
			output.println("POP QUIZ!!! Answer above the bars"				  );
			output.println(" What are the four nations name? "				  ); // Question 1 
			output.println(" "				  ); // Line 15 user answer's question 
			output.println("______________________________________________________");  

			output.println(" Who can master all four elements? "); // Question 2 line 17
			output.println(" ");  // Line 18 User's question Q2
			output.println("_______________________________________________________"); // Blank line-  

			output.println(" What nation attacked? ");
			output.println(" ");  
			output.println("_______________________________________________________");  

			output.close(); // *** Dont forget to close the output or a memmory leak can occur***
			} 
		catch (IOException ex) {	//Catching the Execption  
			System.out.printf("Error", ex);  // error message pops if we catch it. 
		}
	
	 


// The file is made now lets have the console read it. 
	
		// have to cover it in try / catch to pervent any execptions poping up 
		try { 	
			Scanner input = new Scanner(file);  // Scanner to read the file 


			//Line 1 - 13
			String Line1 = input.nextLine();
			String Line2 = input.nextLine();
			String Line3 = input.nextLine();
			String Line4 = input.nextLine();
			String Line5 = input.nextLine();
			String Line6 = input.nextLine();
			String Line7 = input.nextLine();
			String Line8 = input.nextLine();
			String Line9 = input.nextLine();
			String Line10 = input.nextLine();
			String Line11 = input.nextLine();
			String Line12 = input.nextLine();
			String Line13 = input.nextLine();

			
			// Question 1
			String Q1 = input.nextLine(); // Line 14 question 1 
			String Q1_Answer = input.nextLine(); // Line 15 user reply 
			String Line16 = input.nextLine(); 
			
			//Question 2
			String Q2 = input.nextLine(); // Line 17 Question 2 
			String Q2_Answer = input.nextLine(); // Line 18 user reply 
			String Line19 = input.nextLine(); 
			
			//Question 3 
			String Q3 = input.nextLine(); // Line 20 Question 3 
			String Q3_Answer = input.nextLine(); 
			
			// If successful this will print to console 	
			System.out.println("Question one anwser: water, earth fire air nation.  ");
			System.out.println("Your Answer " + Q1_Answer);
			System.out.println();

			System.out.println("Question two anwser: The only one who can master all elements is the Avatar  ");
			System.out.println("Your Answer " + Q2_Answer);
			System.out.println();
			
			System.out.println("Question three Answer: fire nation ");
			System.out.println("Your Answer " + Q3_Answer);
			System.out.println();

		}
		
		// If Exectpion is found this will print 
		catch (FileNotFoundException ex) { 
			System.out.println("File not found");
		}
	 
	}
}
