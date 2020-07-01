import java.util.Date; 

public class Transaction {

	private double amount; 				    	// The amount of $ for this transaction 
	private Date timeStamp; 				   // The time and date of this transaction 
	private String memo;  					  // Memo for this transaction. 
	private Account inAccount;  			 // Account in which the transaction was performed
	
	
	/**
	 * create a new transaction 
	 * @param amount 	- The amount transacted 
	 * @param inAccount - The account the tranaction belongs to. 
	 */
	public Transaction(double amount, Account inAccount)  {
		
		this.amount = amount; 
		this.inAccount = inAccount; 
		this.timeStamp = new Date();
		this.memo = ""; 
		
	}
	
	/**
	 * create a new transaction 
	 * @param amount 	- The amount transacted 
	 * @param inAccount - The account the tranaction belongs to. 
	 */
	public Transaction(double amount, String memo, Account inAccount) { 
		
		// call the two-arg constructor first. 
		this(amount, inAccount); 
		
		// set the memo 
		this.memo = memo; 
		
	}
	
	/** 
	 * get the ampumt of transaction 
	 * @return the amount $ value. 
	 */
	public double getAmount() { 
		return this.amount; 
	}
	
	/**get a string summarzing the transaction
	 *  
	 * @return	the summary string. 
	 */
	public String getSummaryLine() { 
		if (this.amount >= 0) { 
			return String.format("\n%s : $%.02f : %s", this.timeStamp.toString(), this.amount, this.memo); 
		}
		else { 
			return String.format("\n%s : $(%.02f) : %s", this.timeStamp.toString(), this.amount, this.memo); 
		}
	}
	
}
