import bank.*;
class account
{
	long account;
	private String atype;
	private final double irate = 5.00;
	private double balance = 1000;
	private int wcount = 0;
	private final double wfee = 2;
	customer cust = new customer();

	account(long account, String atype)
	{
		this.account = account;
		this.atype = atype;
		cust.indata();
	}

	void display()
	{
		System.out.println("\n\n\t\tAccount Detail...");
		cust.data();
		System.out.println("\n Account number : "+account);
		System.out.println("Account Type : "+atype);
		System.out.println("Balance : "+balance);
	}	


	void withdraw(double amt)
	{
		try{
			if(balance < amt)
			throw new  Exception();
			else
			{
				if(wcount == 0)
				{
					balance -= amt;
					wcount++;
				}
				else
				{
					balance = balance - amt - wfee;
					wcount++;
				}
				System.out.println(amt+" withdrawn");
				System.out.println("Balance = "+balance);
			}
		}
		catch (Exception e)
		{
			System.out.println("Insufficient fun");
		}
	}

	double checkbal()
	{
		return balance;
	}
	void deposit(double amt)
	{
		try{
			if(amt <= 0)
			throw new Exception();
			else
			balance += amt;
			System.out.println("After depositing "+amt);
			System.out.println(" balance = "+balance+"\n");
		}
		catch (Exception e)
		{	
			System.out.println("Minimum 1 rupee to be deposited");
		}
	}
	void delacc()
	{
		cust.deldata();
		account = 0;
		atype = null;
		balance = 1000;
	}
}
