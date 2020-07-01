import java.util.ArrayList;

public class Account {

	private String name;  							// Name of the account 
	private String uuid; 						  // Account ID number. 
	private User holder;  						 // User object that owns this account. 
	private ArrayList<Transaction> transactions;  	// List of transactions for this Account. 
	
	/* 
	 * Create New Account 
	 * name 	- The name of the account. 
	 * holder 	- The user object that holds this account. 
	 * theBank  - The bank that issues the account. 
	 */
	public Account(String name, User holder, Bank theBank) {
		
		// set the account name and holder
		this.name = name; 
		this.holder = holder; 
		
		// get the new account uuid 
		this.uuid = theBank.getNewAccountUUID(); 
		
		// init transation 
		this.transactions = new ArrayList<Transaction>(); 
	}
	
	/**
	 * Get the Account ID
	 * @return the uuid. 
	 */
	public String getUUID() { 
		return this.uuid; 
	}
	
	/**
	 * get summary account 
	 * @return the string summary. 
	 */
	public String getSummaryLine() { 
		
		// get account balance. 
		double balance = this.getBalance(); 
		
		// format summary line if negative or positive. 
		if (balance >= 0) { 
		return String.format("%s : $%.02f : %s", this.uuid, balance, this.name); 
		} else { 
		return String.format("%s : $(%.02f) : %s", this.uuid, balance, this.name); 
		}
	}
	
	public double getBalance() { 
		double balance = 0; 
		for (Transaction t : this.transactions) { 
			balance += t.getAmount(); 
	} 
		return balance; 
	}
	
	/**
	 *  Print the trans history of the account. 
	 */
	public void printTranHistroy() { 
		
		System.out.printf("\n Tranaction histroy for account %s\n", this.uuid);
		for (int t = this.transactions.size()-1; t >= 0; t--) { 
			System.out.printf(this.transactions.get(t).getSummaryLine()); 
		}
		System.out.println(); 
	}
	
	public void addTransaction(double amount, String memo) { 
		
		// create new transaction to our lsit. 
		Transaction newTrans = new Transaction(amount, memo, this); 
		this.transactions.add(newTrans); 
	} 
	

} // end of Account class. 
		
