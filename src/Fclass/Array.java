package Fclass;

import java.util.*;
public class Array 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n, sum=0;
		System.out.print("Enter the Array size:");
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("\n"+ "Enter the Array elements:");
			for (int i=0; i<n; i++) 
			{
				a[i]=sc.nextInt();
				sum = sum+a[i];
			}
			System.out.println("\n"+"The Array elements are:");
			for (int j=0; j<a.length; j++) 
			{
				System.out.print( a[j] + " ");
			}
			System.out.print("\n"+ "the Summ Of All value in Array: " + sum);
		}
	}

}
