import java.util.Scanner; 
public class StudentGrades {

	public static void main(String[] args) {
		//Using scanner to gain user input 
		Scanner input = new Scanner(System.in); 
		
		

		//prompt user to enter number of students within the class. 
		//This will be used to tell how big the array is. 
	System.out.println("Please enter a number of students for the class: "); 
	int NumStudents = 0;
	
	NumStudents = input.nextInt();
		
		//Defineing the variables 
		int n = 0; //Setting a counter
		double StudentScore[] = new double[NumStudents]; //Student score will represent the score the student has. 
		
	 
		// grade of the students 
		// double Score;
		 
	
	
	//prompt user to enter the grades 
	System.out.println("Please enter the students grade ");
	
	// loops the user until all scores are entered. 
	while (n < NumStudents ) {
	
	StudentScore[n] = input.nextDouble(); 
	n++;
	}
	n = 0; //Reseting n to 0 
	

	// Calcuate the letter grade of the students below 
		
		char grade;  //setting a char variable to represent the grade letter of the students 
		
		
		// Entering a loop to check the the letter grade is 
		while (n < NumStudents) {
			
			if ( StudentScore[n] >= 90 && StudentScore[n] <= 100 ) { 
					grade = 'A'; 
			}
			else if ( StudentScore[n] >= 80 && StudentScore[n] <= 89 ) { 
					grade = 'B';
			}
			else if ( StudentScore[n] >= 70 && StudentScore[n] <= 79 ) { 
					grade = 'C';
			}		
			else if ( StudentScore[n] >= 60 && StudentScore[n] <= 69 ) { 
					grade = 'D'; 
			}
			else 
				grade = 'F'; 
				
		// Outputting the Students number, the score of the student and the grade value they will obtain from their grade. 
		 System.out.println("Student " + n +" score is " + StudentScore[n] +" and grade is " + grade);
		 n++;
		}
		
		input.close();
	}
}
