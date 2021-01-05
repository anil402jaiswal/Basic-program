package gauravSirPrograms;
import java.util.Scanner;

public class Divition {

	public static void main(String[] args) {
		
		System.out.println("Please enter the persentage");
		Scanner sc= new Scanner(System.in);
		int per = sc.nextInt();
		if(per < 40)
			System.out.println("Fail");
		else if(per >=40 && per < 60)
			System.out.println("C grade");
		
		else if(per >=60 && per < 70)
			System.out.println("B grade");
		
		
		else if(per >=70 && per < 80)
			System.out.println("A grade");
		
		
		else if(per >=80 && per <= 100)
			System.out.println("Excellence");
		
		
		
		else 
			System.out.println("Sorry You are giving wrong no. ");
		
		
		
		
	}

}
