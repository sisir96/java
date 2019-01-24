import java.util.*;
class bbmain
{
	static int count = 0;
	static void create(Bank sbi)
	{
		int choice;
		Scanner inn = new Scanner(System.in);
		System.out.println("\n\t\t Account Creation");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		System.out.println("Enter your choice : ");
		try{
			choice = inn.nextInt();
			if(count < 10) {	
				if(choice == 1) {
					sbi.acc[count] = 									sbi.createacc("Savings");
					count++;
				}
				else if(choice == 2) {
					sbi.acc[count] = 									sbi.createacc("Current");
					count++;
				}
				else {
					System.out.println("\n Wrong Entry");
					System.out.println("Account 									not created");
				}
			}
			else
			System.out.println("Sorry reached max no of accounts");
		}
		catch(Exception e)
		{
			System.out.println(e +" integer required");
		}
	}
	
	static void display(Bank sbi, int pos)
	{
		while(true)
		{
			Scanner in = new Scanner(System.in);
			double amt;
			int choice;

			System.out.println("\n\n\t\t Welcome....");
			System.out.println("1.Depsoit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.My Account Details");
			System.out.println("5.Logout");
			System.out.println("Enter your choice : ");
			try {
				choice = in.nextInt();
		
				if(choice == 1)
				{
					System.out.println("Enter the deposit");
					System.out.print("amount");
					amt = in.nextDouble();
					sbi.acc[pos].deposit(amt);
				}
				else if(choice == 2)
				{
					System.out.println("Enter the");
 					System.out.print("withdrawal amt");
					amt = in.nextDouble();
					sbi.acc[pos].withdraw(amt);
				}
				else if(choice == 3)
				{
					System.out.println("Balance = ");
					System.out.println									(sbi.acc[pos].checkbal());
				}
				else if(choice == 4)
				{
					sbi.acc[pos].display();
				}
				else if(choice == 5)
				{
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println(e+" integer required");
			}
		}
	}

	static void login(Bank sbi)
	{
		long accnt;
		int pos = -1;
		Scanner inn = new Scanner(System.in);
		System.out.println("Enter the account number : ");
		accnt = inn.nextLong();
		
		for(int i = 0; i < count; i++)
		{
			if(sbi.acc[i].account == accnt)
			pos = i;
			break;
		}
		if(pos != -1)
		display(sbi,pos);
		else
		System.out.println("Invalid account number");
	}

	public static void main(String args[])
	{
		Bank sbi = new Bank();
		Scanner in = new Scanner(System.in);
		int choice;
		while (true) {
			try {
			System.out.println("\n\n\t\t Welcome To SBI");
			System.out.println("1. Know about our branch");
			System.out.println("2. Open Account");
			System.out.println("3. Manage your account");
			System.out.println("4. Quit");
			System.out.println("Enter your choice");
			//try{
				//Scanner in = new Scanner(System.in);
				choice = in.nextInt();
				if(choice == 1)
				sbi.bdisplay();
				else if(choice == 2)
				create(sbi);
				else if(choice == 3)
				login(sbi);
				else if(choice == 4)
				break;
				else
				System.out.println("Enter another choice");
			}
			catch(Exception e)
			{
				System.out.println(e+" integer require");
				in.next();
			}
		}
	}
}
