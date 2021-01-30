package GoravSirArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q14shortingTheArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of subject");
		int n = sc.nextInt();
		int arr[] =new int[n];
		int temp=0;
		System.out.println("Enter the no.");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		
		
		//Sorting by Bubble sort
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		//sorting by Selection sort
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		// Sorting by predefine method
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
