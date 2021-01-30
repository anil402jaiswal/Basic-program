package Practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		int n = str.length();
		String r = "";
		
		for(int i=n-1;i>=0;i--)
		{
			r= r+ str.charAt(i);
		}
	System.out.println(r);

	}

}
