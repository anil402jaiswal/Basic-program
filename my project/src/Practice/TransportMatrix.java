package Practice;

import java.util.Scanner;

public class TransportMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        
        System.out.println("Enter the no. of row");
        int row = sc.nextInt();
        
        System.out.println("Enter the no. of colum");
        int colum = sc.nextInt();
        
        int arr[][] = new int[row][colum];
        int brr[][] = new int[colum][row];
        System.out.println("Enter the element of array");
    for(int i=0;i<row;i++)
     {
	  for(int j=0;j<colum;j++)
	  {
		  arr[i][j] = sc.nextInt();
	 }}
    
    System.out.println("View of Matrix before Transport");
    for(int i=0;i<row;i++)
    {
	  for(int j=0;j<colum;j++)
	  {
		  System.out.print(arr[i][j]+" ");
	 }
	  System.out.println();
	  }
    
System.out.println("View of Matrix after transport");
    for(int j=0;j<colum;j++)
    {
	  for(int i=0;i<row;i++)
	  {
		  
		  System.out.print(arr[i][j]+" ");	
		  }
	     System.out.println();  
    }

    
   
	}

}
