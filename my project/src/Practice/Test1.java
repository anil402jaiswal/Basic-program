package Practice;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		
		// Find out the odd position element of 2d array string  
		
		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String Element of 2-D array");
      String  s1[][] = new String[3][3];
     
     int k=0;
      
      for(int i=0;i<3;i++) {
    	  for(int j=0;j<3;j++)
    	  {
            
    		s1[i][j] = sc.nextLine();
    }}
      //String s[] = new String[20];
      char    strE[]  =   new char[50];
      String s2 = s1[2][1];
      int n=s2.length();
      
     for(int i=0; i<n;i++)
     {
    	 if(i%2!=0)
    	 {
    		 strE[k]= s2.charAt(i);
    		 k++;
    	 }
     }
     System.out.print(strE);

}
}