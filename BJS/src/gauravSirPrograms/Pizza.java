package gauravSirPrograms;
import java.util.*;

public class Pizza {

	public static void main(String[] args) {
		System.out.println("Please enter the amount");
		Scanner sc= new Scanner (System.in);
		int amount = sc.nextInt();
		
		if(amount < 50)
			System.out.println("Go to recharge");
		
		else if(amount >= 50 && amount < 100)
			System.out.println("Simple Pizza");
		
		else if(amount >= 100 && amount < 200)
			System.out.println("Veg Pizza");
		
		else if(amount >= 200 && amount < 350)
			System.out.println("Paneer Pizza");
		
		else if(amount >= 350 && amount < 600)
			System.out.println("Chikan Pizza");
		
		else  
		System.out.println("You can purchase anything:");
		
		
		

	}

}
