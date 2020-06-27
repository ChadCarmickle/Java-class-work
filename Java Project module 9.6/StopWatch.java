public class StopWatch {

		public static void main(String[] args) { 
		
			
			// Createing the stopwatchmethod object to gain methods from the other class 
			StopWatchMethod StopWatchMethod = new StopWatchMethod(); 
			

			
			//Createing the array 
			//int[] NumberArray = getArray();
			
			StopWatchMethod.start();
			
			int[] RandomArray = ObtainArray(); 
			
			selectionSort(RandomArray);
			
			StopWatchMethod.Stop();
			
			//Testing it out 
			System.out.println("The starting time is " 
								+ StopWatchMethod.GetStartTime()); 								
			
			System.out.println(" The Ending time is " 
								+ StopWatchMethod.GetEndTime());
		
			System.out.println("The elasped time between start and end is " 
								+ StopWatchMethod.GetElapsedTime() / 60 + " Seconds"); 
			
			// Display the execution time
			System.out.println("The time for sorting 100,000 " +
				"numbers using selection sort: " + StopWatchMethod.GetElapsedTime() +
				" milliseconds");
	
	}

		public static int[] ObtainArray() {
			// Create an array of length 100,000
			int[] array = new int[100000];
			for (int i = 0; i < array.length; i++) {
				array[i] = (int)(Math.random() * 100000);
			}
			return array; 
		}
		
	//Creating the SelectionSort method 
		public static void selectionSort(int[] array) {
			//the for loop that will exit when i is less than the array length. 
			for (int i = 0; i < array.length - 1; i++) {
				
				int min = array[i];  // min to stand for minimum 
				int minIndex = i;   // to stand for the index were the minimum is found 

				for (int n = i + 1; n < array.length; n++) { 
					if (array[n] < min) {   // if the array number is less than the current minimum number 
						min = array[n];		// then set min = to that number 
						minIndex = n;		// and minindex = that number 
					}
					}

				if (i != minIndex) {           // if i isnt equal to minIndex 
					array[minIndex] = array[i];          // array minimumIndex is equal to array i (the counter) 
					array[i] = min;						// array counter i is equal to the minmum. 
				}
			}
			}
}


