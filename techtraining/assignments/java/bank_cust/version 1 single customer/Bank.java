import java.util.*;
class Bank
{
	String bname = "SBI";
	String address = "7th stage, Mylsandra";
	String manager = "Rishab Jain";
	static long anum = 10001;
	account acc;
	void bdisplay()
	{
		System.out.println("Bank details");
		System.out.println("Name : "+bname);
		System.out.println("Address : "+address);
		System.out.println("Manager : "+manager);
	}
	account createacc(String type)
	{
		account acc = new account(anum,type);
		anum++;
		System.out.println("Accout created successfully");
		return acc;
	}
}
