package gauravSirPrograms;
import java.util.Scanner;

public class Avrage {
	public static void main(String[] args) {
		System.out.println("Enter the No.");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	double avg = (double)(a+b+c)/3;
	
	System.out.println("Avarage=" +avg);
	

}
}