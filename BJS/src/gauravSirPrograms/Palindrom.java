package gauravSirPrograms;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) 
	
	{
		int sum=0;
		int n1=0;
		System.out.println("Please enter the number");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		n1=n;
		
		while(n>0)
			{
			int rem=n%10;
			sum= 10*sum+rem;
			n=n/10;
			}
		if(n1==sum)
			System.out.println("Number is pelindrom");
		else
			System.out.println("Number is not pelindrom");
	}

}
