import java.util.*;
class bmain
{
	public static void main(String args[])
	{
		Bank sbi = new Bank();
		Scanner in = new Scanner(System.in);
		int choice;
		int flag = 1;
		while(flag == 1)
		{
			System.out.println("\n\n\t\t Welcome To SBI");
			System.out.println("1. Know about our branch");
			System.out.println("2. Open account");
			System.out.println("\nEnter the choice : ");
			choice = in.nextInt();

			if(choice == 1)
			sbi.bdisplay();
			else if(choice == 2)
			{
				int achoice;
				System.out.println("\n\n\t\tAccount type : ");
				System.out.println("1. Savings");
				System.out.println("2. Current");
				System.out.println("\nEnter choice : ");
				achoice = in.nextInt();
				if(achoice == 1)
				{
					sbi.acc = sbi.createacc("Savings");
					flag = 0;
				}
				else if(achoice == 2)
				{
					sbi.acc = sbi.createacc("Current");
					flag = 0;
				}
				else
				System.out.println("Sorry wrong entry");
			}
			else
			System.out.println("Sorry wrong entry");
		}
		while(true)
		{
			double amt;
			System.out.println("\n\n\t\tWelcome...");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.My Account Detail");
			System.out.println("5.Logout");
			System.out.println("Enter your choice : ");
			choice = in.nextInt();

			if(choice == 1)
			{
				System.out.println("Enter the deposit amount");
				amt = in.nextDouble();
				sbi.acc.deposit(amt);	
			}
			else if(choice == 2)
			{
				System.out.println("Enter the withdraw amt");
				amt = in.nextDouble();
				sbi.acc.withdraw(amt);
			}
			else if(choice == 3)
			{
				System.out.print("Balance = ");
				System.out.println(sbi.acc.checkbal());
			}
			else if(choice == 4)
			{
				sbi.acc.display();
			}
			else if(choice == 5)
			{
				break;
			}	
		}
		System.out.println("Thank you visit again...");
	}	
}
