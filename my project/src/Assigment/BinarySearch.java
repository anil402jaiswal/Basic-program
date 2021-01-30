
package Assigment;

import java.util.Scanner;
public class BinarySearch{
	public static void main(String[] args) {
		int a[] = {10,20,34,44,54,64,72,84,93,141,172} ;
		Scanner sc=new Scanner(System.in);
		int l=0;
		int h=a.length-1;
		int mid=(l+h)/2;
		int search=sc.nextInt();

		
		while(l<=h)
		{
		      if(search==a[mid])
		      {
		    	  System.out.println("the position of "+search+" is = "+(mid+1));
		    	  break;
		      }
		      else if(search>a[mid])
		      {
		    	  l=mid+1;
		    	  mid=(l+h)/2;
		      }
		      else
		      {
		    	  h=mid-1;
		    	  mid=(l+h)/2;
		      }
		      if(l>h)
		    	  System.out.println("Element is not found");
		      
		}	 
}
}

