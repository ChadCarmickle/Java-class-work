
/*
Chapter 4 
4.5 (Geomtry of a regular polygon) A regular polygon is a n-sided polygon in which all sides are of the same length and 
all angles have the same degree (i.e, the polygon is both equilateral and equiangular). The formula for computing the 
area of a regular polygon is 
								   n x S^2 
						Area = ________________
							    4 x tan(pi / n) 	
Here s is the length of the side 
Write a program that prompts the user to enter a number of sides and their length of a regular polygon and dispalys the
area. 
*/ 
// Side notes 	n = user input for side
// Side notes   s = user input for length of side 

import java.util.Scanner;
public class polygon {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
	
	// Prompt user to enter the polygon 
	System.out.print("Please enter the number of sides of a polygon: ");
	int n = input.nextInt(); 

	while (n < 0) {
		System.out.println("Enter positive number ");
		n = input.nextInt();
		}
	
	// Prompt user to enter the length of the sides 
	System.out.print("Enter the length of the side: ");
	double s = input.nextDouble();
	
	while (s < 0) {
		System.out.print("Please enter a possibe number: "); 
		s = input.nextInt();		
	}
	
	//compute the area of a regular polygon 
	double Area = (n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n))); 
	


		System.out.println(Area);
	 
		
		
		
		
		
		

	}

}
