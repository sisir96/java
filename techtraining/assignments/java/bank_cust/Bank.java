import java.util.*;
class Bank
{
	String bname = "SBI";
	String address = "7th stage, Mylsandra";
	String manager = "Rishab Jain";
	static long anum = 10001;
	account[] acc = new account[10];
	int delacc[] = new int[10];
	/**
	* This constructor for bank class will
	* set values for delacc array as -1,
	* This array keep track of deleted accounts.
	*/
	Bank()
	{
		for(int i=0; i < 10; i++)
		delacc[i] = -1;
	}
	/**
	* This method is used to display the details of bank
	* @param Nothing
	* @return Nothing
	*/
	void bdisplay()
	{
		System.out.println("\nBank details");
		System.out.println("Name : "+bname);
		System.out.println("Address : "+address);
		System.out.println("Manager : "+manager);
	}
	/**
	* This method is used to create new account
	* @param type it holds the type of account that is saving or current
	* @return account returns object of class account after successful
	* accoutn creation.
	*/
	account createacc(String type)
	{
		account acc = new account(anum,type);
		System.out.println("Accout created successfully");
		System.out.println("Acount number is : "+anum);
		anum++;
		return acc;
	}
}
