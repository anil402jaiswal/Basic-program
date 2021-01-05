package Array;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		
		int count=0;
		
		
		int arr[]= new int[15];
		System.out.println("Enter the elements of array");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<15;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the no. for finding the occurence of that no. ");
		
		int n=sc.nextInt();
		
		int i=1;
		do
		{
			if(n==arr[i])
				{ count++; }
			i++;
		}
		
		while(i<=12);
		System.out.println("The no. of occurence of "+n+" is");
		
		int min=arr[0];
		for(int j=1;j<15;j++)
		{
			if(min>arr[j])
				min=arr[j];
				
				}
		System.out.println("The Minimum no. of the array is "+min);
		
		int y=count+min;
		System.out.println("The Sum of occurence and min = "+y);
		
		
		int max=arr[0];
		for(int j=1;j<15;j++)
		{
			if(max<arr[j])
				max=arr[j];
				
				}
		System.out.println("The Maximun no. of the array is "+max);
		
		int resultent = max-y;
		System.out.println("The Resultent is "+resultent);
		
		if(resultent%2==0)
			System.out.println("The Resultent is Even no.");
		else 
			System.out.println("The Resultent is odd no.");	
			
	}

}
