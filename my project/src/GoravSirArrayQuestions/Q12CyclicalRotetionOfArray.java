package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q12CyclicalRotetionOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of array element");
		int n = sc.nextInt();   
		sc.close();
		int arr[] = new int[n];
		int brr[] = new int[n];
		System.out.println("Enter the  array element");
  
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		brr[0]=arr[n-1];
		for(int i=0;i<n-1;i++)
		{
			brr[i+1]=arr[i];
		}
		for(int i=0;i<n;i++)
		{System.out.println(brr[i]);}
	}

}
