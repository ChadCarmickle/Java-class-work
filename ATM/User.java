import java.util.ArrayList; 
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException; 

public class User {

	private String firstName; 				    // Name of user 
	private String lastName; 				   // Last name 
	private String uuid;  					  // Unique ID 
	private byte pinHash[];  				 // MD5 hash of users pin. 
	private ArrayList<Account> accounts; 	// The list of account for this user. 

	public User(String firstName, String lastName, String pin, Bank theBank) {
		
		// set users Name. 
		this.firstName = firstName; 
		this.lastName = lastName; 
	
		// Store the pin using MD5 hash for security. 
			// Java requires try and catch to use MessageDigest even though MD5 is valid. 
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinHash = md.digest(pin.getBytes()); // Takes the pin and secures it. 
		} catch (NoSuchAlgorithmException e) {
			System.err.println("Error caught NoSuchAlgorithmExeption.");
			e.printStackTrace();
			System.exit(1);
		}
		
		// get a new unique univeral ID for the user. 
		this.uuid = theBank.getNewUserUUID(); 
		
		// create empty list of accounts. 
		this.accounts = new ArrayList<Account>(); 
		
		// Print log message
		System.out.printf("New User %s, %s with ID %s created .\n", 
				lastName, firstName, this.uuid);
		
	}
	
	/*
	 * add an account for the user 
	 * AnAcct - the account to add. 
	 */
	public void addAccount(Account anAcct) { 
		 this.accounts.add(anAcct); 
		
	}
	
	/**
	 * Return the user's UUID 
	 * @return the uuid; 
	 */
	public String getUUID() { 
		return this.uuid; 
	}
	
	
	/**
	 * Check if pin matches the true user Pin.  
	 * @param 	- aPin the pin to check 
	 * @return  - Whether the pin is valid or not. 
	 */
	public boolean validatePin(String aPin) { 
			
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				return MessageDigest.isEqual(md.digest(aPin.getBytes()), 
						this.pinHash); 
			} catch (NoSuchAlgorithmException e) {
				System.err.println("Error caught NoSuchAlgorithmExeption.");
				e.printStackTrace();
				System.exit(1);
			} 
			return false; 
		} 
		
	public String getFirstName() { 
		return this.firstName; 
	}
	
	public void printAccountsSummary() { 
		System.out.printf("\n\n%s's account", this.firstName);
		for (int a = 0; a < this.accounts.size(); a++) { 
			System.out.printf("  %d) %s\n", a+1, 
					this.accounts.get(a).getSummaryLine());
		}
		System.out.println();
	}
	
	/**
	 * get the number of accounts of the user 
	 * @return	the number of accounts. 
	 */
	public int numAccounts() { 
		return this.accounts.size(); 
	}
	
	/**
	 * Obtain account History 
	 * @param acctIdx
	 * 		  account History. 
	 */		  
	public void printAccTranHistory(int acctIdx) { 
		this.accounts.get(acctIdx).printTranHistroy(); 
	}
	
	/**
	 *  Obtain account balance 
	 * @param acctIdx account id 
	 * @return	account balance. 
	 */
	public double getAcctBalance(int acctIdx) { 
		return this.accounts.get(acctIdx).getBalance(); 
	}
	
	/**
	 * Get the UUID of a particular account 
	 * @param acctIdx - the index of the account to use 	
	 * @return		  - The UUID of the account. 
	 */
	public String getAcctUUID(int acctIdx) { 
		return this.accounts.get(acctIdx).getUUID(); 
	}
	
	/**
	 * Add transaction to a partiuclar account. 
	 * @param accIdx 	the index of this account 
	 * @param amount	the amount of the transaction 
	 * @param memo		the memo of the transaction. 
	 */
	public void addAcctTransaction(int acctIdx, double amount, String memo) { 
		this.accounts.get(acctIdx).addTransaction(amount, memo); 
		
	}
	

}
