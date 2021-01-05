package gauravSirPrograms;
import java.util.Scanner;

public class Amstrong_no {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
     int count=0;
     double sum=0;
		System.out.println("Enter the no.");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int n1=n;
		double n2=n;
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		for(int i = 0; i<=count; i++)
		{
			int rem=n1%10;
			sum = sum + Math.pow(rem,count);
			n1=n1/10;
		}
		
		if(n2==sum)
			System.out.println("This is the Amstrang no.");
			else 
				System.out.println("This is not the Amstrang no.");
		
		

	}

}
