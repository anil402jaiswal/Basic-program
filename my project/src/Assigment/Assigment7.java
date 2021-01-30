package Assigment;

import java.util.Scanner;

public class Assigment7 {

	public static void main(String[] args) {
		int arr[]= new int[50];
		int brr[]=new int[50];
		int crr[]=new int[50];
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the no. of element of in array");
	     int n= sc.nextInt();
	     System.out.println("Enter the array element");
	     for(int i=0;i<n;i++)
	   
	     {
	    	 arr[i] = sc.nextInt(); 
	    	 brr[i]=arr[i];
	    	 crr[i]=arr[i];
	     }
	     int flag=0;
	     for(int i=0;i<n-1;i++)
	     {
	    	for(int j=0;j<n-1-i;j++)
	    	{
	    		if(arr[j]<arr[j+1])
	    		{
	    			int temp=arr[j+1];
	    			arr[j+1]=arr[j];
	    			arr[j]=temp;
	    			flag=1;
	    		}
	    	}
	    	if(flag==0)
		    	 break;
	     }
	     System.out.println("Array in desending");
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println(arr[i]);
	     }
	     
	     
	     
	     
	     
	     
	     for(int i=0;i<n-1-2;i++)
	     {
	    	for(int j=0;j<n-1-2-i;j++)
	    	{
	    		if(brr[j]>brr[j+1])
	    		{
	    			int temp=brr[j+1];
	    			brr[j+1]=brr[j];
	    			brr[j]=temp;
	    			flag=1;
	    		}
	    	}
	    	
	     }
	     System.out.println("Array in Ascending order");
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println(brr[i]);
	     }
	     
	     
	     
	     
	     
	     int temp=crr[3];
	       crr[3]=crr[1];
	       crr[1]=temp;
	     System.out.println("Swapping according to 3rd case");
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println(crr[i]);
	     }
	     
	          
	}

}
