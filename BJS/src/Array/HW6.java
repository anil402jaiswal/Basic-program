package Array;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int brr[] = new int [10];
		System.out.println("Enter the element of the array");
		
		for(int i=0; i<10;i++)
		{
			arr[i] = sc.nextInt(); 
		}
		
		for(int i=0; i<10;i++)
		{
			int j=0;
			if(arr[i]==9)
				continue;
			else
				{  
				brr[j]=arr[i];
						j++;  
				}}
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum+=arr[i];
		}
		
		
	}

}
