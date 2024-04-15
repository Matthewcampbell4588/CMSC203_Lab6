
public class SavingsAccount extends BankAccount{
	private double rate = 2.5; // annual interest rate
	private int savingsNumber = 0;
	private String accountNumber;
	
	// create normal contructor and copy
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber()+"-"+savingsNumber;
	}
	
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		String oldAccNum = oldAccount.getAccountNumber();
		savingsNumber = Character.getNumericValue(oldAccNum.charAt(oldAccNum.length()-1)) + 1;
		accountNumber = super.getAccountNumber() +"-"+savingsNumber;
	}
	
	/**
	 * Adds a month of interest to the balance
	 */
	public void postInterest() {

		double incress = 1.0 + (rate/100.0);
		double numsOfMonths = 1.0/12.0; 
		double newBalance = super.getBalance()*Math.pow(incress, numsOfMonths);
		
		super.setBalance(newBalance);
	}
	
	/***
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
}