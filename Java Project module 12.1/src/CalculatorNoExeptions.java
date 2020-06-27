import java.util.Scanner;

public class CalculatorNoExeptions {  
	
	// main method of the program 
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in); 
	  
	int i = 1;   
	while(i == 1) {   
	 
	
	 //prompt user to enter in 2 numbers and the operation. 
	System.out.println("Enter a number followed by an operation then a final number");
	
	 
	  // The program will take up to 3 operation for example 1 + 3 = 4   (1 = 0 in array) while 4 = 4 in array
    if (args.length != 3) {
      System.out.println("Usage: java Calculator operand1 operator operand2");
      System.exit(0);
    }

    // The result of the operation
    int result = 0;

    
  
		    // Determine the operator. 
		    switch (args[1].charAt(0)) { 
		      case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
		                break;
		      case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
		                break;
		      case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
		                break;
		      case '/': 
		    	  if (args[2] != "0") {   
		    		  result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		    	  }
		    	  else { 
		    	  System.out.println("Can not divide by zero");
		      }
		       	} // brace to end switch block 


    
    		// Display the results of program 
    		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
    			+ " = " + result);
    		    	 

 

    
   //Custom Loop    
	
	System.out.println();
    
    System.out.println("Would you like to continue? 0 for no, 1 for yes" );
    i = input.nextInt(); 
    while(i > 1 || i < 0) { 
    	System.out.println("Invalid numbr, Please enter 0 for no or 1 for yes to continue");
    	i = input.nextInt(); 
    }
    
    if (i == 1) { 
    	i = 1; 
    } 
    else if (i == 0) { 
    	i = 0;
    	break; 
    }
    else // If user access else statement error will display. 
    	i = 0; 
    System.out.println("Error 101: Else Statement used, Contact Creator");
    }
    
	
	
	
	// Ending displaying messages. 
	System.out.println(" Goodbye ");
	System.out.println(" Program terminated succefuly ");
	
	
  }
}