package GoravSirArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q6ArrayPrintingWithoutDuplication {

	public static void main(String[] args) {
// TODO Auto-generated method stub    {10, 15, 20, 60, 90, 20, 15, 20}

	     Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of array element");
		int n= sc.nextInt();
		int arr[] = new int[n];
		int temp[] =new int[n];
		int j=0;
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++)
		{
		  arr[i] = sc.nextInt();
			}
		Arrays.sort(arr);
		
		
		
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i] != arr[i+1])
			{
				temp[j++] = arr[i];
			}
		}
		temp[j]=arr[n-1];
		
		System.out.println("The value of j="+j);
		for(int i=0;i<j;i++)
		{
			System.out.println(temp[i]);
		}
			
	}}
