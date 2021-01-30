package Assigment;

import java.util.Scanner;

public class Assigment9 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
          System.out.println("Enter the Diagonal of array");
          int n = sc.nextInt();
          int arr[][] = new int[n][n];
          System.out.println("Enter the element of array");
  for(int i=0;i<n;i++)
  {
	  for(int j=0;j<n;j++)
	  {
		  arr[i][j] = sc.nextInt();
		  
	  }
  }
  
  System.out.println("Sum of 1st ROw");
  int sum1=0;
  for(int i=0;i<1;i++)
  {
	  for(int j=0;j<n;j++)
	  {
		  sum1=sum1+arr[i][j];
	  }
  }
  
  System.out.println(sum1);
  System.out.println("Sum of 2st ROw");
  int sum2=0;
  for(int i=1;i<2;i++)
  {
	  for(int j=0;j<n;j++)
	  {
		  sum2=sum2+arr[i][j];
	  }
  }
  
  System.out.println(sum2);
	}

}
