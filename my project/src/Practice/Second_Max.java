package Practice;

import java.util.Scanner;

public class Second_Max {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of element in array");
		int n= sc.nextInt();
		int arr[] = new int[50];
		
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
			}
		}
	}
	
	System.out.println("The 2nd hightest is = "+arr[1]);
         
	}}
