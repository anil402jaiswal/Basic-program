package GoravSirArrayQuestions;

import java.util.Scanner;

public class AvrgQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of element of array");
		int n = sc.nextInt();
		float n1 = n;
		int arr[] = new int[n];
		double sum=0;
		System.out.println("Enter the element of array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			
			sum=sum+arr[i];
			}
		double total = sum;
		double ans = (total/n1) ;
		
		System.out.println("Avrage is= "+ans);
		
	}

}
