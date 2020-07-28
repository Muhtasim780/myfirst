package Fclass;

public class Array_2D {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [][] twoDarray = new int [3][3] ; // lets make a 2D_Array
		/* [ 1 3 5
		 *   2 4 6
		 *   7 9 0 ] */
		
		twoDarray [0][0] = 1;	          
		twoDarray [0][1] = 3;
		twoDarray [0][2] = 5;
		
		twoDarray [1][0] = 2;
		twoDarray [1][1] = 4;
		twoDarray [1][2] = 6;
		
		twoDarray [2][0] = 7;
		twoDarray [2][1] = 9;
		twoDarray [2][2] = 0;
		
		pr("\n"+ twoDarray[2][2]);
	}
	
	static void prln(Object anyObject) // printing to next line;
	{
		System.out.println("\n" + anyObject);
	}
	
	static void pr(Object anObject) // printing to the line;
	{
		System.out.print("\n" + anObject);
	}

}
