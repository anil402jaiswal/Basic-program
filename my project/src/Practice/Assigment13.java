package Practice;

import java.util.Scanner;

public class Assigment13 {

	public static void main(String[] args) {
		String friend [][] = new String [3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String in 2D array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			 friend[i][j] = sc.nextLine();
			}
		}
		String s1 = friend [1][2];
		byte [] str1 = s1.getBytes();
		int sum1=0;
		for(int i=0;i<s1.length();i++)
		{
			sum1=sum1+str1[i];
		}
		
	
		System.out.println("The sum of byte code of friend[1][2] "+sum1);
		
		String s2 = friend [1][0];
		byte [] str2 = s1.getBytes();
		String s3 =s1.concat(s2);
        int sum2=0;
		for(int i=0;i<s2.length();i++)
		{
			sum2=sum2+str2[i];
		}
		
		System.out.println("The sum of byte code of friend[1][0] "+sum2);
		
		int result =  sum1 +sum2;
		
		
		
		System.out.println("resultent ="+result);
	}

}
