package Practice;

import java.util.Scanner;

public class Assigment12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		System.out.println("Enter the element of array");
        int temp=1;
        int sum1=0;
        int sum2=0;
		for(int i=0;i<3;i++)
		{
          for(int j=0;j<3;j++)
          {
    	  arr[i][j]=temp;
    	  System.out.print(arr[i][j]+" ");
    	  temp++;
    	 }
      System.out.println();
      }
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				sum1=sum1+arr[i][j];
		}
		}
		int x=sum1;
		System.out.println("The sum of right diagonal ="+x);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if((i+j)==2)
				{
					sum2=sum2+arr[i][j];
				}
					
			}
		}
		int z=sum2;
		System.out.println("The sum of left diagonal is = "+z);
		
		int s=arr[0][0]+arr[2][1]+arr[1][2];
		System.out.println("The value of s ="+s);
		double p  = (x-z)*(x+z)*(1.5);
		
		double q = (x*x)+s;
		double r = p/q;
		double A = (Math.pow(r, 0.5));
		
		System.out.println("The value of A is = "+A);
		
		if(A%2==0)
			System.out.println("The value of A is Even");
		
		if(A%2!=0)
			System.out.println("The value of A is Odd");
		
		
		
		
	}

}
