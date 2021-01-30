package Assigment;

import java.util.Scanner;

public class LinearSearch {
	
	static int search(int arr[], int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {10,20,34,44,54,64,98,332} ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. which we want to search ");
		int key = sc.nextInt();
	
		
		System.out.println("The position of no. is "+ search(a,key));
		
}
}
