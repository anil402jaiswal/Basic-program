package Algorithum;

import java.util.Scanner;

public class Selection_short {

	public static void main(String[] args) {
		int arr[]= new int[50];
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the no. of element of in array");
	     int n= sc.nextInt();
	     System.out.println("Enter the array element");
	     for(int i=0;i<n;i++)
	    {
	    	 arr[i] = sc.nextInt(); 
	    }
	     for(int i=0;i<n;i++)
	     {
	    	 for(int j=i+1;j<n;j++)
	    	 {
	    		 if(arr[i]>arr[j])                                                                // This logic for ascending order
	    		{
	    			 int temp=arr[i];
	    			 arr[i]=arr[j];
	    			 arr[j]=temp;
	    		 }}}
	     System.out.println("The shorted array =");
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println(arr[i]);
	     }             }}
