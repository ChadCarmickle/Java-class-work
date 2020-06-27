
/* Write a program that prompts the user to enter an integer for todays day of the week.
 Sunday = 0   Monday = 1...and Saturday = 6. Also prompt the user to enter the number of days 
 after today for a future day and display the future day of the week. 
 */

import java.util.Scanner; 
public class Day_Of_Week {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter todays date: ");
		int DayOfWeek = input.nextInt(); 
			while  (DayOfWeek < -1 || DayOfWeek > 6) 
				{
			  		System.out.print("Please enter a number between 0 to 6 ");
			  		DayOfWeek = input.nextInt(); 			
				}
		
		System.out.print("Please enter future days: ");
		int UserDay = input.nextInt(); 
			while (UserDay < 0) 
				{
					System.out.print("Please enter a positive number: ");
					UserDay = input.nextInt();
				}
		
		int FutureDay = (UserDay + DayOfWeek) % 7;
		
		if(DayOfWeek == 0){
			System.out.print(" Sunday ");
		}else if(DayOfWeek == 1){
			System.out.print(" Monday ");
		}else if(DayOfWeek == 2) {
			System.out.print(" Tuesday ");
		}else if(DayOfWeek == 3) {
			System.out.print(" Wednesday ");
		}else if(DayOfWeek == 4) {
			System.out.print(" Thursday ");
		}else if(DayOfWeek == 5) {
			System.out.print(" Friday ");
		}else if(DayOfWeek == 6) {
			System.out.print(" Saturday ");
		} 
		
		if(FutureDay == 0){
			System.out.print(" Sunday ");
		}else if(FutureDay == 1){
			System.out.print(" Monday ");
		}else if(FutureDay == 2) {
			System.out.print(" Tuesday ");
		}else if(FutureDay == 3) {
			System.out.print(" Wednesday ");
		}else if(FutureDay == 4) {
			System.out.print(" Thursday ");
		}else if(FutureDay == 5) {
			System.out.print(" Friday ");
		}else if(FutureDay == 6) {
			System.out.print(" Saturday ");
		}
	
		
	
	}
}

 