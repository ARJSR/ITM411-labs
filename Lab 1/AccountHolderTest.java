import java.util.Scanner;
import javax.swing.JOptionPane;
//Author Antonio Jackson
public class AccountHolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in); //lost
        double balance = 0;
        double annualInterestRate = 0;
        //start an object and access data for static fields
        
        
        AccountHolder ah1 = new AccountHolder(balance); 
        //AccountHolder.annualInterestRate = .4;
        //create an instance for annual interest rate    
        ah1.setAnnualInterestRate(annualInterestRate);
        
        //Get balance from user
        //while (true) {
        		//balance = JOptionPane.showInputDialog("What is your initial balance?");
        	System.out.println("What is your initial balance");
        	balance = sc.nextDouble();
        	if (balance < 0.0)
                throw new IllegalArgumentException("balance must be non-negative");

        		//if (balance < 0)
                 //System.out.println("Pls. reenter a positive beginning balance");
        	  	 //balance = sc.nextDouble();
        	  ah1.setBalance(balance);
        	  //break;
        
           	System.out.println("");
        	Scanner input = new Scanner(System.in);
    		System.out.println("Would you like to access the bank menu?");
    		
    		System.out.println("");
    		
    		System.out.println("Select B To view Balance");
    		System.out.println("Select D: To make a Deposit");
    		System.out.println("Select W: To make a Withdrawal");
    		System.out.println("Type Exit to Leave Program");//: input = "Have a great day";
    			
    		String Selection = input.next();
    		Selection = Selection.toUpperCase();
    		
    		switch (Selection)
    		{
    			case "B":  
    				System.out.printf("Your balance is: $%.2f", balance);
    			break;
    			case "D":
    				System.out.println("How much would you like to deposit?");
    				balance = input.nextDouble();
    				ah1.deposit(balance);
    			break;
    			case "W":
    				System.out.println("How much would you like to withdraw?");
    				
    				balance = input.nextDouble();
    				//if (balance < 50)
    					//System.out.println("Account cannot be less than $50");
    					//balance = input.nextDouble();
    					ah1.withdrawal(balance);
    				break;
    			
    			case "Exit":
    				System.out.println("Thank you, have a great day");
    		}
    		  
        //ah1.getMenu();     
        
        //I could use a switch statement for the withdrawal and deposit info
        //or I could list them seperately while calling the objects from the
        //AHClass
        
        //start out with a menu with a choice to "Deposit", "Withdrawal",  
        //"View Balance", or "Exit"
        
        System.out.println("");
        System.out.printf("Your Balance is $%.2f ", ah1.getBalance());
        System.out.println("");
        System.out.println("");
        //System.out.println("Monthly Balance Reciept: ");
        //System.out.println("Annual Interest Rate: " + AccountHolder.getAnnualInterestRate(annualInterestRate));
        //System.out.println("Your monthly interest is: " + (AccountHolder.getAnnualInterestRate(annualInterestRate)/12));
        //System.out.println("Your monthly interest rate is: " + AccountHolder.getMonthlyInterestRate(annualInterestRate));
        System.out.format("%-10s%n","Monthly Balance \n" + "With Interest Rate");
        //System.out.println("Ending Monthly Balance");
        System.out.printf("$%.2f", ah1.monthlyInterest());
      
	}

}
