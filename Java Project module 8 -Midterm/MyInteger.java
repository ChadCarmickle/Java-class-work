
//Chad Carmickle 
// Class Object named MyInteger 
public class MyInteger {
		
		//Variables 
		private static int value; 
		
					
	    //Default Constructor 
			public MyInteger() { 	
				MyInteger.value = 0; 
			}
			// Constructor to set num equal to value 
			public MyInteger(int num) {
			       value = num;
			}
			       
		 // Get-er & set-er to get the value from user and set to set the number
				public int get() {
					return value; 
				}
				public void set(int Users_number) {  
					Users_number = value; 
				}
			
			// Methods to check if number if even or odd. 
				public static boolean isEven(int value) { 
					if (value % 2 == 0) {
						return true;
					}
					else 
						return false;
				}
				
				public static boolean isOdd(int value) { 
					if (value % 2 == 1) { 
						return true;
					}
						
					else 
						return false;
				}
										
			public String toString() {
				return ("The value of the MyInteger object is " + value);

				}
}
			


