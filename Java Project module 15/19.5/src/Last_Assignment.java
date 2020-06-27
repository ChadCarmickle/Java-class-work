
/* 
 19.5 (Maximum element in an array) Implement the following 
 method that returns the maximum element in an array. 
 
 public static <E> extends Comparable<E>> E max(E[] list) 

Plus-  
 create at least three arrays of different types, 
 and call the max() function for each. 
 
 */
public class Last_Assignment {

	public static void main(String[] args) { 

	
		Integer[] First_Array = new Integer[10];
		Integer[] Second_Array = new Integer[20];
		Integer[] Third_Array = new Integer[30];
		
		
        for (int i = 0; i < First_Array.length; i++) {
        	First_Array[i] = i;
        }
        for (int i = 0; i < Second_Array.length; i++) {
        	Second_Array[i] = i;
        }
        
        for (int i = 0; i < Third_Array.length; i++) {
        	Third_Array[i] = i;
        }
        
        System.out.println("Max number for First Array is: " + max(First_Array));
        System.out.println(); 
        System.out.println("Max number for Second Array is: " + max(Second_Array));
        System.out.println();
        System.out.println("Max number for Third Array is: " + max(Third_Array));
    	}

    public static <E extends Comparable<E>> E max(E[] list) {

        E max = list[0];
        for (int i = 1; i < list.length; i++) {
            E element = list[i];
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
	
		
		
		
	}
}
