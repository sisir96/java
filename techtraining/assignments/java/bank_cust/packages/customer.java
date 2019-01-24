package bank;
import java.util.*;
public class customer
{
	private String cname;
	private String caddress;
	private String cphno;
	private String caadhar;
	private String cpan;
	
	public void indata()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("\nEnter the customer name: ");
		cname = in.nextLine();
		System.out.println("Enter the customer address: ");
		caddress = in.nextLine();
		System.out.println("Enter the customer phone number: ");
		cphno = in.next();
		System.out.println("Enter the aadhar number: ");
		caadhar = in.next();
		System.out.println("Enter the pan number: ");
		cpan = in.next();
	}

	public void data()
	{
		System.out.println("\nCustomer details:");
		System.out.println("Name : "+cname);
		System.out.println("Address : "+caddress);
		System.out.println("Phone Number : "+cphno);
		System.out.println("Aadhar Number : "+caadhar);
		System.out.println("PAN Number : "+cpan);
	}
	public void deldata()
	{
		cname = null;
		caddress = null;
		cphno = null;
		caadhar = null;
		cpan = null;
	}
} 
