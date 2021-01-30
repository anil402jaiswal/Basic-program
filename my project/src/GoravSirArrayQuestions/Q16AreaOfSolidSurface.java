package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q16AreaOfSolidSurface {

	public static void main(String[] args) {

		System.out.println("Please enter the redious");
		Scanner sc= new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
		double  area=   (double) (4/3*3.14*r*r); 
		
		System.out.println("The area of sphere ="+area);
		
		}}
