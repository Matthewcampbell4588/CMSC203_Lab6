
public class CheckingAccount extends BankAccount{
	private static final double FEE = 0.15;
	//create constructer
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		super.setAccountNumber(getAccountNumber() + "-10");
	}
	
	// create withdraw that allows a with draw to take place
	
	public boolean withdraw(double take_out) {
		boolean completed = false;
		
		if (take_out+FEE <= super.getBalance()) {
			super.setBalance(super.getBalance()-(take_out+FEE));
			completed = true;
		}
		
		return completed;
	}
}