package StringProgram;

import java.util.Scanner;

public class StringPalindom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for check whather string palindrom or not");
		   String s1 = sc.nextLine();
		//String s1= new String("maam mam");
		int n = s1.length();
		String rev = "";
	     for(int i=n-1;i>=0;i--)
	     {
	    	 rev = rev+s1.charAt(i);
	     }
		
	     System.out.println(rev);
	     if(rev.equals(s1))
	     System.out.println("String is palimdom");
	     
	     else
	    	 System.out.println("String is not palindom");
        
	}

}
