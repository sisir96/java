import java.util.*;
class Bank
{
	String bname = "SBI";
	String address = "7th stage, Mylsandra";
	String manager = "Rishab Jain";
	static long anum = 10001;
	account[] acc = new account[10];
	void bdisplay()
	{
		System.out.println("\nBank details");
		System.out.println("Name : "+bname);
		System.out.println("Address : "+address);
		System.out.println("Manager : "+manager);
	}
	account createacc(String type)
	{
		account acc = new account(anum,type);
		System.out.println("Accout created successfully");
		System.out.println("Acount number is : "+anum);
		anum++;
		return acc;
	}
}
