package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q4ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of element");
            int n = sc.nextInt();
            int arr[] =new int[n];
            int brr[] = new int[n];
            int j=0;
            System.out.println("Enter the element og array");
            for(int i=0;i<n;i++)
            {
            	arr[i] = sc.nextInt();
            }
            
            for(int i=0;i<n;i++)
            {
            	brr[j] = arr[n-i-1];
            	j++;
          }
            
            for(int i=0;i<n;i++)
            {
            	System.out.println(brr[i]);
            }
	}

}
