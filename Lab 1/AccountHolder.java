import javax.swing.JOptionPane;
import java.util.Scanner;


public class AccountHolder {
// instance fields
	private double balance;
	private static double annualInterestRate = .4;
	
	public AccountHolder(double bal) {
		// TODO Auto-generated constructor stub
		//set member field to starter value
		this.balance = bal;
		balance = bal < 0 ? 0: bal; //CEO Conditional Expression Officer
	}
		
	public void setBalance(double bal) {
		balance = bal;
	}
	public double getBalance() {
		//annualInterestRate = annualInterestRate/12;
		
		//balance += balance;
		if (balance < 50)
			System.out.println("Can not withraw less than $50\n"
					+ "from your bank account!");
				
		
		//else
			//balance = balance;
		return balance;
	}
	public double monthlyInterest()
	{
		balance += balance * annualInterestRate/12.0;
		return balance;
	}
	/* Accept balance arg, to boost (update) 
	 * the current balance
	 */
	public void deposit(double bal)
	{
		
		balance += bal;
	}	
	/*discount (drop) balance up to a limit
	 * and warn user if they have reached the limit
	 */
	public void withdrawal(double bal)
	{ // check current balance with local value
	  // and update the reduction and verify 
		
		balance -= bal;
		{
		//if (bal < 50)
			//System.out.println("Can not withraw less than $50"
				//	+ "from your bank account!");
		//else
			//balance = bal;
		}
	}
	public void setAnnualInterestRate(double annualInterestRate) {
	       AccountHolder.annualInterestRate = .04;
				//this.annualInterestRate = annualInterestRate;
	}
	 public static double getMonthlyInterestRate() {
		
		 annualInterestRate = annualInterestRate/12;
		 return annualInterestRate;
	}
	
	


	}
