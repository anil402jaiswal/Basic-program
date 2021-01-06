package Algorithum;

import java.util.Scanner;

public class Bubble_short {

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
	     int flag=0;
	     for(int i=0; i<n-1;i++)
	     {
	    	 
	    	 for(int j=0;j<n-1-i;j++)
	    	 {
	    		 if(arr[i]>arr[i+1])         //ascending order logic
	    			 
	    			// if(arr[i]>arr[i+1])      descending order logic
	    			 
	    		 {
	    			 int temp=arr[i];
	    			 arr[i]=arr[i+1];
	    			 arr[i+1]=temp;	 
	    			 flag=1;
	    		 } }
	    	 if(flag==0)
	    		 break;
	     }
	     System.out.println("The shorted are in assending order is ");
	     for(int i=0;i<n;i++)
	     System.out.println(arr[i]);
	}

}
			