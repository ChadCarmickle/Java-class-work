import java.util.Scanner;

public class Sep13 {

	public static void outlist(int [] numbers, int numitems,int choice) {
		// Output the original array
		
				System.out.print("The original list is: ");		
				for (int ct = 0; ct <= numitems-1; ct++) {
					System.out.print(" " + numbers[ct]);
				}
				System.out.println();
		
				for (int ct = 0; ct < numitems; ct++) {
					    // Generate an index rand randomly 
					    int rand = (int)(Math.random() * numitems);
					    // Swap numbers[ct] with numbers[j]
					    int temp = numbers[ct];
					    numbers[ct] = numbers[rand]; 
					    numbers[rand] = temp;
				}

//Print the reverse array		
		if (choice == 1)  
		{	System.out.print("The reversed array is"); 
		
		}
		
//Print the original array 
		else if (choice ==0){
			System.out.print("The original list is: ");		
			for (int ct = 0; ct <= numitems-1; ct++) {
				System.out.print(" " + numbers[ct]);
			}
		}		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Sep 13 in class project\n");

// Data declarations
		int[] numbers = {0,0,0,0,0,0,0,0,0,0};  //hold up to 10 integers, default val 0
		Scanner input = new Scanner(System.in);  // for input
		int numitems = 0;  // number of valid data points entered by user
		int choice = 3; // putting in the choice to prompt user if they want the list shuffled or original

// Input actual user data
		System.out.println("Enter up to 10 positive integers; or enter 0 or negative to quit");
		int tempin;  // hold the input value until we know it is any good
		for (int ct = 0; ct <= 9; ct++) {
			System.out.println("Enter value " + (ct+1) + ":");
			tempin = input.nextInt();
			if (tempin > 0) {
				numbers[ct] = tempin;
				numitems++;
			}
			else 
				break;  //exit the loop if a zero or negative number is input.
//		System.out.println("num items so far is: " + numitems);
		}
//ask if user wants original or reverse. 	
		System.out.println("Would you like the list in reverse or origional print?");
		System.out.println("Press 1 for reverse or press 0 for origional ");
		choice	= input.nextInt(); 
				
		
//output number of data points 
		System.out.println("The number of data points is: " + numitems);		
		
//output the original array 
		outlist(numbers, numitems, choice); 
		
// Search for a user specified value
		System.out.print("Enter a integer value to search the list for: ");
		tempin = input.nextInt();
		System.out.println("The value" + tempin);
		
		boolean foundit = false; //assume value not in list
		for (int ct=0; ct < numitems; ct++) {
			if (numbers[ct] == tempin) {
				foundit = true;  // value is found
				break;
			}
		}
		if (foundit) System.out.println("IS IN THE LIST");
		else System.out.println("IS NOT IN THE LIST");
			
	}
}