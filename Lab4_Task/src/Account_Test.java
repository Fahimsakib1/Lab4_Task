
public class Account_Test 

{

	public static void main(String[] args) 
	{
		Account A1 = new Account (" Fahim ", " fghghgg2522", 250000);
		System.out.println(A1);
		A1.show();
		A1.Deposit(50000);
		A1.Withdraw(2500);
		System.out.println();
		
		A1.CurrentBalance(25000,50000,2500);
		
		

	}

}
