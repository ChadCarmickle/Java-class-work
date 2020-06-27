import java.util.Scanner;

public class SortNumbers 
{

				public static void main(String[] args) 
  {
   
	  				Scanner input = new Scanner(System.in);
	  				System.out.print("Enter three numbers: ");
	  				double num1, num2, num3;
	  				num1 = input.nextDouble();
	  				num2 = input.nextDouble();
	  				num3 = input.nextDouble();			
					
	  				System.out.println("The lowest to heights of those numbers are: ");
	  				DisplaySortNumbers(num1, num2, num3); 
	
	  				input.close();
   
  }
				
				public static void DisplaySortNumbers(double num1, double num2, double num3) 
			  	
				{
					
					{
						if (num1 < num2 && num2 < num3)
								System.out.print(num1 + " " + num2 + " " + num3);
						else if (num1 < num3 && num3 < num2)
								System.out.print(num1 + " " + num3 + " " + num2);
						else if (num2 < num1 && num1 < num3)
								System.out.print(num2 + " "+ num1 + " " + num3);
						else if (num2 < num3 && num3 < num1)
								System.out.print(num2 + " " + num3 + " " + num1);
						else if (num3 < num1 && num1 < num2)
								System.out.print(num3 + " " + num1 + " " + num2 );
						else 
								System.out.print(num3 + " " + num2 + " " + num1);
					  
					}
					
					
				}  		
			  		
}



		