package Array;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
	   int j=0;
	   int l=0;
		int count=0;
		int brr[]=new int[10];
		Scanner sc = new Scanner(System.in);
		
	                                                                         	//System.out.println("Enter the no. of  array element");
	                                                                           	//int n = sc.nextInt();
		int arr[] = new int[10];
		
		System.out.println("Enter the element of array");
		for(int i=0;i<10;i++)
		{
			 arr[i] = sc.nextInt();                                            // for 9993043302 input ke liye
			
			}
		
		for(int i=0; i<10;i++)
		{
		
			if(arr[i]==9)
			{
				count++;                                                        //count=3 ho jaega 
				continue;
			}
			else
				
			{	
				brr[j] = arr[i] ;            
			     j++;
			}

		}
		
		for(int k=(10-count);k<10;k++)                              //yaha pe k=(10-count) = 7 ho jaega
		{
			brr[k]=9; 
		}
		
         while(l<10)
		{
			System.out.print(brr[l]);
			l++;
		}
		
	}

}
