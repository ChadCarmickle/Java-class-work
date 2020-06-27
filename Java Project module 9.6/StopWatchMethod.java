
	public class StopWatchMethod {

		// Declare the variables of thr class 
		private  long StartTime; 
		private  long EndTime; 
		
		
		//Creating the constructor for the class that will be used 
		StopWatchMethod() {
			StartTime = System.currentTimeMillis();
			EndTime = System.currentTimeMillis();
			
		}
		
		
		//Creating a method called start() that will gain the current time from the system clock 
		public void  start() {
			StartTime = System.currentTimeMillis();
		}
				
		//Creating a method called Stop() that will gain the current time from the clock when it stops 
	    public void Stop() {
			EndTime = System.currentTimeMillis();
		}

	
	//Calculate the difference miliseconds that passed between them 
			public long GetElapsedTime()  { 
				return 	GetEndTime() - GetStartTime();  

		}
		
		//Creating a method that gets the starting time 
		public long GetStartTime() {
			return StartTime;
		}
		
		//Creating a method that gets the ending time 
		public long GetEndTime() {
			return EndTime;
		}	
	}
