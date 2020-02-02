import java.util.Scanner;
import javax.swing.JOptionPane;
//Author Antonio Jackson
public class AccountHolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in); //lost
        double balance = 0;
       
        //start an object and access data for static fields
        
        //AccountHolder.annualInterestRate = .04;
        AccountHolder ah1 = new AccountHolder(balance); 
        
        //Get balance from user
        while (true) {
        		//balance = JOptionPane.showInputDialog("What is your initial balance?");
        	System.out.println("What is your initial balance");
        	balance = sc.nextDouble();
        	  if (balance < 0)
                 System.out.println("Pls. reenter a positive beginning balance");
        	  else ah1.setBalance(balance);
              break;

        }   
          	Scanner input = new Scanner(System.in);
          	System.out.println("");
    		System.out.println("Would you like to access the bank menu?");
    		
    		System.out.println("Select B To view Balance");
    		System.out.println("Select D: To make a Deposit");
    		System.out.println("Select W: To make a Withdrawal");
    		System.out.println("Type Exit ");//: input = "Have a great day";
    			
    		String Selection = input.next();
    		Selection = Selection.toUpperCase();
    		
    		switch (Selection)
    		{
    			case "B":  
    				System.out.println("Your balance is: " + balance);
    			break;
    			case "D":
    				System.out.println("How much would you like to deposit?");
    				balance = input.nextDouble();
    				ah1.deposit(balance);
    			break;
    			case "W":
    				System.out.println("How much would you like to withdraw?");
    				balance = input.nextDouble();
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
        
        
        System.out.println("Balance = " + ah1.getBalance());
        
	}

}
