package Fclass;

import java.util.Scanner;

public class SecondClass {
	static Scanner mySc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String a , b , c ;
		a = "Too much Short name" ;
		b = "Too much Big Name" ;
		c = "Nice Name";
		
		pr("Enter The Name: ");
		String myName = mySc.nextLine();
		pr("Welcome " + myName);
		pr("\n"+"Length of String: "+ myName.length());
		if (myName.length() < 4)
		{
			pr("\n"+a);
		}
		else if (myName.length() > 28) 
		{
			pr("\n"+b);
		}
		else
		{
			if (myName.length()==24) 
			{
				prln("Your are Lucky");
			}
			else prln("Unlucky Name");
			pr("\n"+c);
		}
		// pr("\n"+"CharAtPos 3: "+myName.charAt(4));
		
	}
	
	static void prln(Object anyObject)
	{
		System.out.println("\n" + anyObject);
	}
	static void pr(Object anObject)
	{
		System.out.print("\n" + anObject);
	}
	
}
