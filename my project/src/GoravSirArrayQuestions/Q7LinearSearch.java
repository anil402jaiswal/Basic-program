package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q7LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of array element");
		int n = sc.nextInt();
		int flag=0;
		int arr[] =new int[n];
		System.out.println("Enter the array element");
       for(int i=0;i<n;i++)
       {
    	   arr[i] = sc.nextInt();
       }
       System.out.println("Enter the no. which we want to search");
       int srch =  sc.nextInt();
       for(int i=0;i<n;i++)
       {
    	   if(arr[i]==srch)
    	   {
    		   i++;
    		   System.out.println("The position of "+srch+" is= "+i);
    		   flag=1;
    		   break;
    		   }
    	   
       }
       
       if(flag==0)
    	   System.out.println(srch+" is not found in array");
    	   
    	   
	}

}
