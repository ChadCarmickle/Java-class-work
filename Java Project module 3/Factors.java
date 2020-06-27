
//Importing java scanner 
import java.util.Scanner; 
public class Factors {

	//Gaining input from user 
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		//prompt user to enter a positive number
		System.out.println("Enter a number: ");
		int FactorNum = input.nextInt();
		
		//Prevent user from entering a negative number
		while (FactorNum < 0 ) 
		{
			System.out.println("ERROR: Invalid Number: ");
			FactorNum = input.nextInt();
			
		}
		//Created a number to divide FactorNum with 
		int Num = 2; 
		
		//User enters loop until FactorNum divided by Num is not equal to one. 
		while (FactorNum / Num != 1) 
	   {
				//If factorNum remainder of Num is == to 0 it loop prints factorable numbers 
				if (FactorNum % Num == 0) 
			{
				   System.out.print(Num + ", ");
				   FactorNum /= Num; 
			}
				//if not adds one to Num 
				else
					Num++;
	   }
		//Display factored numbers to user. 
		System.out.println(FactorNum + ".");
	}
}
