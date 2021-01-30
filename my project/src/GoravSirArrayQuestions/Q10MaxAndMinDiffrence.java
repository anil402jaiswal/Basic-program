package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q10MaxAndMinDiffrence {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of array element");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int min=arr[0];
		int max = arr[0];
		int temp=0;
		int flag=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				temp=arr[i];
				arr[i]=max;
				   max=temp;
				}}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				temp=arr[i];
				arr[i]=min;
				   min=temp;
				}}
		int diff = max-min;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==diff)
			{
				flag=1;
				}
		}
		if(flag==1)
			System.out.println("The resultent "+diff+" is avilable in array");
		if(flag==0)
			System.out.println("The resultent "+diff+" is not avilable in array");

		
	}

}
