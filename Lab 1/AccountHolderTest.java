import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class AccountHolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        double balance = 0;
       
        //start an object and access data for static fields
        
        AccountHolder.annualInterestRate = .04;
        AccountHolder ah1 = new AccountHolder(); 
        
        //Get balance from user
        while (true) {
        		balance = JOptionPane.showInputDialog("What is your initial balance?)
        	  if (balance < 0)
                 System.out.println("Pls. reenter a positive beginning balance");
        	  else ah1.setBalance(balance);
              break;

        ah1.getMenu();     
        
        //I could use a switch statement for the withdrawal and deposit info
        //or I could list them seperately while calling the objects from the
        //AHClass
        
        //start out with a menu with a choice to "Deposit", "Withdrawal",  
        //"View Balance", or "Exit"
        
        
        System.out.println("Balance = " + ah1.getBalance());
        
	}

}
