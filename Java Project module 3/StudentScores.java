
//Importing java scanner 
import java.util.Scanner; 
public class StudentScores {

	
	public static void main(String[] args) {

	//Gaining input from user 
	Scanner input = new Scanner(System.in);
	
	//prompt user to enter Student amount 
	System.out.println("Enter the amount of student: ");
	int StudentsNum	= input.nextInt(); 
	
	
	//Define a placeholder for Student Names, High score. Counter. 
	String StudentName = " "; 
	double highScore = 0; 
	int counter = 0 ;
	
	//Put user into loop until Counter < Student Number 
	while (counter == StudentsNum) 
	 {
			//prompt user to enter Student name 
			System.out.println("Enter a students Name: ");
			String name = input.next();
	
			//Prompt user to enter student score 
			System.out.println("Enter a students Score");
			double score = input.nextDouble();
	
			
	
			//Use if statement to check if student score is higher than Highscore 
			if (score > highScore) 
		   {
			
			// Replace high score with score, and name of student and add +1 to counter 
			highScore = score; 
			StudentName = name; 
			counter++;
		  }
			
	 }
		// Display student name with heightest score. 
		System.out.print("Student with the highest score: "+ StudentName + " with " + highScore);
  }
}