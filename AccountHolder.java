
public class AccountHolder {
// instance fields
	double balance;
	static double annualInterestRate;
	
	public AccountHolder(double bal) {
		// TODO Auto-generated constructor stub
		//set member field to starter value
		balance = bal < 0 ? 0: bal; //CEO Conditional Expression Officer
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void monthlyInterest()
	{
		
	}
	/* Accept balance arg, to boost (update) 
	 * the current balance
	 */
	public void deposit(double bal)
	{
	}
	/*discount (drop) balance up to a limit
	 * and warn user if they have reached the limit
	 */
	public void withdrawal(double bal)
	{ // check current balance with local value
	  // and update the reduction and verify 
	
		
	}
	


}
