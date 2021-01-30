package StringProgram;

import java.util.Scanner;

public class NoOFwordinString {

	public static void main(String[] args) {
		
		
		//count any word  in a string(paragraph)
		
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the paragraph");
				String str = sc.nextLine();
				
				System.out.println("Enter the word Which you want to count");
				String word = sc.nextLine();
				
			    String sr[] =  str.split(" ");     //(" ") se string ko split kr rhe he agar me split method ke andar jo likhuga uske a/c string ko split krega
				int count =0;
				
				for(int i=0;i<sr.length;i++)
				{
			
						if( word.equals(sr[i]))
						{
							count++;
						}
					
				}
				System.out.println("The no. of "+word+"="+count);    
				
				
				
				
				
				
				// with the help of method
				
			/*	static int countOccurences(String str, String word)  
				{ 
				    
				    String a[] = str.split(" "); 
				  
				 
			        int count = 0; 
				    for (int i = 0; i < a.length; i++)  
				    { 
				    	
				    if (word.equals(a[i])) 
				        count++; 
				    } 
				  
				    return count; 
				} 
				  
				
				public static void main(String args[])  
				{ 
				    Scanner sc = new Scanner(System.in);
				    System.out.println("Enter the paragraph");
				    String str = sc.nextLine();
				    System.out.println("Enter the word which you want to search");
				    String word = sc.nextLine();
				    System.out.println(countOccurences(str, word)); 
				    
				    */

	}

}
