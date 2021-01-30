package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q13Findout4thEaximumElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of subject");
		int n = sc.nextInt();
		int arr[] =new int[n];
		int temp=0;
		System.out.println("Enter the no.");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		System.out.println("4th maximum no. is = "+arr[3]);
	}

}
