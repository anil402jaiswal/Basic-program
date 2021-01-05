package gauravSirPrograms;
import java.util.Scanner;

public class Fectorial {

	public static void main(String[] args) {
		long fec =1;
		System.out.println("Enter the no.");
		Scanner sc= new Scanner(System.in);
		Long n=sc.nextLong();
		
		for(int i=1; i<=n;i++)
		{
			
			 fec= fec*i;
		}
		System.out.println("The fectorial is = "+fec);
		
	}

}
