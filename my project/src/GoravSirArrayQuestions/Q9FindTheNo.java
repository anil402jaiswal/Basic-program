package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q9FindTheNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of array element");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int flag=0;
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==5 || arr[i]==10)
			{
				flag=1;
				break;
			}
                 
			
		}
		if(flag==1)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		
	}

}
