package Practice;

import java.util.Scanner;

public class Assigment11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		        
		        System.out.println("Enter the size of Matrix is 3*3");
		        //    int n = sc.nextInt();                              For the user input
		        int n=3;
		        String  arr[][] = new String[n][n];
		        System.out.println("Enter the element of array");
		    for(int i=0;i<n;i++)
		     {
			  for(int j=0;j<n;j++)
			  {
				  arr[i][j] = sc.next();
			 }}
		    for(int i=0;i<n;i++)
		    {
		    	for(int j=0;j<n;j++)
		    	{
		    		System.out.print(arr[i][j]+" ");
		    	}
		    	System.out.println();
		    	}
		    System.out.println();
		    System.out.println();
		    System.out.println();
		    for(int j=0; j<2;j++)
		    {
		    	for(int i =0; i<2;i++)
		    	{
		    		System.out.print(arr[i][j]+" ");
		    	}
		    	System.out.println();
		    }
	}

}
