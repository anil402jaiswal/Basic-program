package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q5FindOutMinMaxBetweenIndex2To5 {
       // {9,2,3,5,6,7,20}
	public static void main(String[] args) {

		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of arrary element");
	int n= sc.nextInt();
	System.out.println("Enter the array element");
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
		
	int min=arr[2];
	int max=arr[2];
	
	int temp;
	
	    for(int i=2;i<5;i++)
	    {
	    	if(max<arr[i])
	    	{
	    		temp  = arr[i];
	    		arr[i]= max;
	    		max=temp;
	         }
	    }
	    for(int i=2;i<5;i++)
	    {
	    	if(min>arr[i])
	    	{
	    		temp  = arr[i];
	    		arr[i]= min;
	    		min=temp;
	         }
	    }
	    System.out.println("the maximum element = "+min);
	    System.out.println("the minimum element = "+max);
	}

}
