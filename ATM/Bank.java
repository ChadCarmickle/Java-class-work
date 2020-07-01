import java.util.ArrayList;
import java.util.Random; 

public class Bank {

	private String name; 				    		// Name for the bank 
	private ArrayList<User> users; 				   // List of users 
	private ArrayList<Account> accounts; 		  //  List of user accounts. 

	/** 
	 * create a new bank object with empty lists of users and accounts 
	 * @param name the name of the account. 
	 */
	public Bank(String name) { 
		
		this.name = name; 
		this.users = new ArrayList<User>(); 
		this.accounts = new ArrayList<Account>(); 
	}
	
	
	/**
	 * Generate a new universally unique ID for a user. 
	 * @return the uuid. 
	 */
	public String getNewUserUUID() { 
		
		// inits 
		String uuid;
		Random rng = new Random(); 
		int len = 6; 
		boolean nonUnique; 
		
		// continue looping until we get a unique ID
		do {
			uuid = ""; 
			for (int c = 0; c < len; c++) { 
				uuid +=((Integer)rng.nextInt(10)).toString(); 
			}
			
			// Check to make sure its unique.
			nonUnique = false; 
			for (User u : this.users) { 
				if(uuid.compareTo(u.getUUID()) == 0) { 
					nonUnique = true; 
					break; 
				}
			}
		} while (nonUnique); 
		
		return uuid; 
	}
	public String getNewAccountUUID() { 
		
	// inits 
			String uuid;
			Random rng = new Random(); 
			int len = 10; 
			boolean nonUnique; 
			
			// continue looping until we get a unique ID
			do {
				uuid = ""; 
				for (int c = 0; c < len; c++) { 
					uuid +=((Integer)rng.nextInt(10)).toString(); 
				}
				
				// Check to make sure its unique.
				nonUnique = false; 
				for (Account a : this.accounts) { 
					if(uuid.compareTo(a.getUUID()) == 0) { 
						nonUnique = true; 
						break; 
					}
				}
			} while (nonUnique); 
			
			return uuid; 
	}
	
	/*
	 * add an account for the user 
	 * AnAcct - the account to add. 
	 */
	public void addAccount(Account anAcct) { 
		 this.accounts.add(anAcct); 
		
	}
	
	/*
	 * Create a new user of the Bank. 
	 * 	firstname 	- the user first name 
	 *  lastname 	- the user last name. 
	 * 	pin 		- The pin for the user 
	 * 	return 		- The new users object. 
	 */
	public User addUser(String firstName, String lastName, String pin) { 
	
		// create new user object and add it to our list. 
		User newUser = new User(firstName, lastName, pin, this); 
		this.users.add(newUser); 
		
		// create a savings account for the user 
		// accounts list. 
		Account newAccount = new Account("Savings", newUser, this); 
		newUser.addAccount(newAccount); 
		this.accounts.add(newAccount); 
		
		return newUser; 
	} 
	
	/**
	 * get the user object associated with a particular userID and pin 
	 * @param userID - The uuid of the user 
	 * @param pin	 - The pin of the user 
	 * @return		 - The user object if the login is successful or null. 
	 */
	public User userLogin(String userID, String pin) { 
		
		
		//search through the users 
		for (User u : this.users) { 
			
			// check user ID is correct 
			if (u.getUUID().compareTo(userID) == 0 && u.validatePin(pin)) { 
				return u; 
			}
		}
			// if we have not found a valid user. 
			return null; 
	}
	
	/** 
	 * get the name of the bank
	 * @return the name of the bank. 
	 */
	public String getName() { 
		return this.name; 
	}
	
} // end of class Bank; 
