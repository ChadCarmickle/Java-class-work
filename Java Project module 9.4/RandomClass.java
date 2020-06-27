import java.util.Random;     // importing the random class from java 
import java.util.Scanner;	//importing the system.in 
public class RandomClass {



	public static void main(String[] args) {
		
		//declareing my variables 
		int userNumber = 0;		//variable for user input 
		Scanner input = new Scanner(System.in);	 	//using scanner input 
		
		//creating the seed for 1000
		//Creating userinput seed
		Random randomNumber = new Random(1000);
		Random UserNumbers = new Random(userNumber); 
		
		//prompt user to enter a number greater than 0 and less than 100,000
		System.out.print("Enter a number above 0 and below 100000 : ");
		userNumber = input.nextInt();
		
		//Check to make sure user input's number is correct 
		int m = 0; 
		while (m == 0 )
		if(userNumber < 0 || userNumber > 100000) { 
			System.out.print("Invalid Number please enter a number above 0 and below 100000 : ");
			
			userNumber = input.nextInt();
			m = 0; 
		}
		else
			m = 1; 
		 
		//space out output 
		System.out.println();
		System.out.println("The first 50 numbers from 1 to 99 are: ");
		System.out.println(); 
		
		//createing a loop to only display 50 numbers 
		for (int i = 0; i < 50; i++) 
			{ 
			  System.out.printf("%7d ", randomNumber.nextInt(101)); // displays 1-99 
			  if ((i + 1) % 10 == 0) {
	                System.out.println();
	            }	
			}
		//Space out output 
		System.out.println();
		
		//Loop to only output 50 numbers 
		System.out.println("The first randomly generated " + userNumber + " numbers you choose from 1 to 99 are: ");
		System.out.println(); 
		for (int i = 0; i < 50; i++) 
					{ 
			
		//Calcualte the users numbers 
		System.out.printf("%7d ", UserNumbers.nextInt(userNumber)); // displays 1-99
           if ((i + 1) % 10 == 0) {
               System.out.println();
           		}
		}
		input.close(); //close input to get rid of annoying error 
	}
	
}


