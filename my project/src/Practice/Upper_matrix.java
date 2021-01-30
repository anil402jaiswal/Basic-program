package Practice;

import java.util.Scanner;

public class Upper_matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of row ");
		int row = sc.nextInt();
		System.out.println("Enter the no. of colum");
		int colum = sc.nextInt();
		
		System.out.println("Enter the element of array");
		int arr[][] = new int[row][colum];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colum;j++)
			{
				arr[i][j]=sc.nextInt();
			
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colum;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Upper Tranguler matrix is =");
		if(row==colum)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colum;j++)
				{
					if(i<j)           // For lower tranguler matrix (i>j)
					{
						arr[i][j]=0;
					}
				}
			}
		}
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colum;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		if(row!=colum)
	      System.out.println("This is not squre matrix");
		
		
	}

}
