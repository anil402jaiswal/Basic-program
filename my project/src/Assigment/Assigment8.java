package Assigment;

import java.util.Scanner;

public class Assigment8 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int s1[][] = new int[3][3];
		int s2[][]= new int[3][3];
		int s3[][] = new int[3][3];
		
		System.out.println("Enter the Element of s1 array");
		for(int i=0; i<3;i++) {
		for(int j=0;j<3;j++)   {
	    
			s1[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Enter the Element of s2 array");
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++)   {
		    
				s2[i][j]= sc.nextInt();
				
				}
				System.out.println();
			}
		
		
		
		System.out.println("The resultent s3 Array is ");
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++)   {
		    
				s3[i][j] = s1[i][j] + s2[i][j];
				System.out.print(s3[i][j]+" "); 
				}
				System.out.println();
			}
		
				
}}
