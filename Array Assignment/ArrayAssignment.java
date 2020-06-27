/*
To do list- 
	1) Create an array that can hold up to 10 integers. 
	2) Have the user enter a loop that prompts the user to enter a integer. 
		A) The loop must have a max of 10. 
		B) The loop must NOT accept negative numbers. 
		C) The loop must NOT accept  the number 0.
		D) If a negative number or 0 is entered the loop exits. 
		E) The loop must keep track of how many items are in the array. 
		F) The loop must output the number of items in the loop after the input is complete.   
	3) Output the list (The numbers the user entered into the array). 
	4) Randomize the list (Example use the video from VideoNote we looked at in class monday.
	5) Prompt the user to enter a single integer and output "IN THE LIST" or "NOT IN THE LIST". 
	6) Output all values in the re-organized list. 	
*/
//Importing the java Scanner 
import java.util.Scanner; 

//The class is named Array
public class ArrayAssignment {

	//Adding public static and using the scanner to gain input from the user. 
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
		
	
	//Setting the array size to 10. Also setting userNum = to 1 to start the loop. 
	int ArrayNum[] = new int[10]; 
	int UserNum = 1;	
	short i = 0; 
	
		while (UserNum > 0 && i < 10) {
			
			i++;
			ArrayNum[i] = UserNum ;
			System.out.print(" Enter a integer: ");
			ArrayNum[i] = input.nextInt();
		
			System.out.println(ArrayNum[i]); 
		}
		
		 
	}

}
