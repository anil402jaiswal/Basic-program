package GoravSirArrayQuestions;

import java.util.Scanner;

public class RemoveNoQ2 {

	
	//only for {28, 38, 50, 19, 20, 60}.

	
	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of element of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
      
      int j=0;
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("The no. which we want to remove");
		
		for(int i=0;i<n-1;i++)
		{
		{
				arr[i] = arr[i+1];
		}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
