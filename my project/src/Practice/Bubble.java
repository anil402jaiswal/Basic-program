package Practice;

import java.util.Scanner;

public class Bubble {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of elemnet in array");
		int n = sc.nextInt();
		
		   int arr [] = new int[n];
		   for(int i=0;i<n;i++)
		   {
			   arr[i] = sc.nextInt();
		   }
		   int temp;
		   for(int i=0 ; i<n-1;i++)
		   {
			   for(int j=0;j<n-1-i;j++)
			   {
				   if(arr[j] < arr[j+1]) {
					   temp=arr[j+1];
					   arr[j+1] = arr[j];
					   arr[j] = temp;
 				   }
					   
			   }
		   }
		   System.out.println("the shorted array is = ");
		   for(int i=0 ; i<n;i++)
		   {
			  System.out.println(arr[i]); 
		   }
		
	}
}
