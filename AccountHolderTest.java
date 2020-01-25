import java.util.Scanner;

public class AccountHolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        double balance = 100;
       
        //start an object
        AccountHolder ah1 = new AccountHolder(1000.00); 
        ah1.setBalance(balance);
        System.out.println("Balance = " + ah1.getBalance());
        
	}

}
