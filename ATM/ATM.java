import java.util.Scanner; 


public class ATM {

	public static void main(String[] args) {
		
		// init scanner 
		Scanner sc = new Scanner(System.in); 
		
		// init Bank 
		Bank theBank = new Bank("Gringotts Wizarding Bank"); 
			
		// add a user, which also creates a saving account. 
		User aUser = theBank.addUser("Rubeus", "Hagrid", ""); 
		
		// add a checking account ofor our user. 
		Account newAccount = new Account("Checking", aUser, theBank); 
		aUser.addAccount(newAccount);
		theBank.addAccount(newAccount);
		
		User curUser; 
		while (true) { 
			
			//stay in login prompt until sussessful login
			curUser = ATM.MainMenuPromt(theBank, sc); 
			
			// stay in main menu until the user quits. 
			ATM.printUserMenu(curUser, sc); 
 
		}
	}
	
	/**
	 * Print the ATM login Menu 
	 * @param theBank	the bank object whose account to use
	 * @param sc		the scaner object to use 
	 * @return			user. 
	 */
	public static User MainMenuPromt(Bank theBank, Scanner sc) { 	
		
		String userID; 
		String pin; 
		User authUser; 
		
		// prompt the user for the user ID/pin until a correct one is reached. 
		do { 
			System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());  
			System.out.print("Enter user ID  (Number above)"); 
			userID = sc.nextLine(); 
			System.out.print("Enter pin: ");
			pin = sc.nextLine(); 
			
			// obtain the user object corresponding to the user ID and pin combo 
			authUser = theBank.userLogin(userID, pin); 
			if (authUser == null) { 
				System.out.print("Incorrect user ID or pin combination " +
						"Please try again. "); 
			} 
			
		} while(authUser == null); // cont loop until login is susessful. 
		
		return authUser; 
	} 
	
	public static void printUserMenu(User theUser, Scanner sc) {
	
			// print summary user account. 
			theUser.printAccountsSummary(); 
			
			// init 
			int choice; 
			boolean InputFlag = true; 
			// user menu 
			do { 
				System.out.printf("Welcome %s, What would you like to do?\n",  
				theUser.getFirstName()); 
				
			System.out.printf("\n 1) Display the Account transaction history\n"); 
			System.out.printf(" 2) Withdraw Money\n"); 
			System.out.printf(" 3) Deposit\n"); 
			System.out.printf(" 4) Tranfer\n"); 
			System.out.printf(" 5) Exit\n"); 
			System.out.println(); 
			System.out.printf("Enter Choice: ");
			choice = sc.nextInt(); 
			
			if (choice <1 || choice > 5) { 
				System.out.println("Invalid choice please enter 1-5"); 
			}
			} while (choice < 1 || choice > 5); 
			
			switch (choice) { 
			
			case 1: 
				ATM.showTranHistory(theUser, sc); 
				break;
			
			case 2: 
				ATM.withdrawFunds(theUser, sc); 
				break;
			
			case 3: 
				ATM.depositFunds(theUser, sc); 
				break;
			
			case 4: 
				ATM.tranferFunds(theUser, sc);
				break;
			}
			
			// redisplay this menu unless user quits. 
			if (choice != 5) { 
				ATM.printUserMenu(theUser, sc);
			}
	}
	
	/**process tranfering funds from one account to another.
	 *  
	 * @param theUser	- The logged-in user object. 
	 * @param sc		- The Scanner object used for user Input. 
	 */
	public static void showTranHistory(User theUser, Scanner sc) { 
		
		int theAcct; 
		
		// get the account whose transaction history to look at. 
		do {
			System.out.printf("Enter the number (1-%d) of the account " + 
					" whose transactions you want to see: ", 
					theUser.numAccounts()); 
			theAcct = sc.nextInt()-1;
			if (theAcct < 0 || theAcct >= theUser.numAccounts()) { 
				System.out.printf("Invalid Account. "); 
			}
		} while (theAcct < 0 || theAcct >= theUser.numAccounts()); 
		
		// print tran history. 
		theUser.printAccTranHistory(theAcct); 
	}
	
	/** Process a fund withdraw from an account 
	 * 
	 * @param theUser	- The logged in user object 	
	 * @param sc		- The Scanner object user from user-input. 
	 */
	public static void withdrawFunds(User theUser, Scanner sc) { 
		
		int fromAcct; 
		double amount;  
		double acctBal;
		String memo; 
		
		// get the acct tranfer from 
		do { 
			System.out.printf(" Eneter the number (1-%d) of the account \n" + 
						"to withdraw from: ",  theUser.numAccounts());
			fromAcct = sc.nextInt()-1; 
			if (fromAcct < 0 || fromAcct >= theUser.numAccounts()) { 
				System.out.print("Invalid account, please try again. "); 
			}
			 
		} while(fromAcct < 0 || fromAcct >= theUser.numAccounts()); 
		acctBal = theUser.getAcctBalance(fromAcct); 
		
		do { 
			System.out.printf("Enter the amount to tranfer (max $%.02f): $", 
					acctBal);
			amount = sc.nextDouble(); 
			if (amount < 0 ) { 
				System.out.printf("Amount must be greater than zero");
			}
			else if (amount > acctBal) { 
				System.out.printf("Amount must be greater than \n" +
						"balance of $%.02f\n");
			}
		} while(amount < 0 || amount > acctBal); 
		
		// gobble up rest of prevous input 
		sc.nextLine(); 
		
		// get a memo 
		System.out.println("Enter a memo" );
		memo = sc.nextLine(); 
		
		// do the withdraw 
		theUser.addAcctTransaction(fromAcct, -1*amount, memo);
	}
	
	/** process a fund to deposit to an account  
	 * 
	 * @param theUser 	- The logged in user object. 
	 * @param sc		- The scanner object. 
	 */
	public static void depositFunds(User theUser, Scanner sc) { 
		
		int toAcct; 
		double amount;  
		double acctBal;
		String memo; 
		
		// get the acct tranfer from 
		do { 
			System.out.printf(" Enter the number (1-%d) of the account \n" + 
						"to tranfer from: ", theUser.numAccounts());
			toAcct = sc.nextInt()-1; 
			if (toAcct < 0 || toAcct >= theUser.numAccounts()) { 
				System.out.print("Invalid account, please try again. "); 
			}
			 
		} while(toAcct < 0 || toAcct >= theUser.numAccounts()); 
		acctBal = theUser.getAcctBalance(toAcct); 
		
		do { 
			System.out.printf("Enter the amount to tranfer (max $%.02f): $", 
					acctBal);
			amount = sc.nextDouble(); 
			if (amount < 0 ) { 
				System.out.printf("Amount must be greater than zero");
			}
			
		} while(amount < 0); 
		
		// gobble up rest of prevous input 
		sc.nextLine(); 
		
		// get a memo 
		System.out.println("Enter a memo" );
		memo = sc.nextLine(); 
		
		// do the withdraw 
		theUser.addAcctTransaction(toAcct, amount, memo);
		
		System.out.printf("You have sussessfully added " + amount + " to the account."); 
	}
	
	/** Tranfer funds. 
	 * 
	 * @param theUser - The account holder 
	 * @param sc	  - Scanner id. 
	 */
	public static void tranferFunds(User theUser, Scanner sc) { 
		// inits 
		int fromAcct; 
		int toAcct; 
		double amount;  
		double acctBal; 
		
		// get the acct tranfer from 
		do {   
			System.out.printf(" Eneter the number (1-%d) of the account \n" + 
						"to tranfer from: ", theUser.numAccounts());
			fromAcct = sc.nextInt()-1; 
			if (fromAcct < 0 || fromAcct >= theUser.numAccounts()) { 
				System.out.print("Invalid account, please try again. "); 
			}
			 
		} while(fromAcct < 0 || fromAcct >= theUser.numAccounts()); 
		acctBal = theUser.getAcctBalance(fromAcct); 
		
		// get the acount to tranfer to. 
		do { 
			System.out.printf(" Eneter the number (1-%d) of the account \n" + 
						"to tranfer to: ", theUser.numAccounts());
			toAcct = sc.nextInt()-1;  
			if (toAcct < 0 || toAcct >= theUser.numAccounts()) { 
				System.out.print("Invalid account, please try again. "); 
				}
				 
			} while(toAcct < 0 || toAcct >= theUser.numAccounts()); 
		
		// get the amount to tranfer. 
		
		do { 
			System.out.printf("Enter the amount to tranfer (max $%.02f): $", 
					acctBal);
			amount = sc.nextDouble(); 
			if (amount < 0 ) { 
				System.out.printf("Amount must be greater than zero\n");
			}
			else if (amount > acctBal) { 
				System.out.printf("Amount must be greater than \n" +
						"balance of $%.02f.\n", acctBal);
			}
		} while(amount < 0 || amount > acctBal); 
		
		// perform tranfer. 
		
		theUser.addAcctTransaction(fromAcct, -1*amount, String.format(
				"Tranfer to account %s", theUser.getAcctUUID(toAcct))); 
		theUser.addAcctTransaction(toAcct,  amount, String.format(
				"Tranfer to account %s", theUser.getAcctUUID(fromAcct))); 
		
		System.out.printf("Your Tranfer was successful.");
		
}
	


} // end of ATM class. 
