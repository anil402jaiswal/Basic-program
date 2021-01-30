package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q3Shifting {

	//only for {0,9,0,9,0,9,0}


	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = {0,9,0,9,0,9,0};
		int n = arr.length;
		int count = 0;
		int j=0;
		int brr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			if(arr[i]==9)
			{
		     count++;
		     continue;
			}
			brr[j] = arr[i];
		}
		
		for(int i=n-count;i<n;i++)
		{
			brr[i] = 9;
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+brr[i]);
		}
	}

}
