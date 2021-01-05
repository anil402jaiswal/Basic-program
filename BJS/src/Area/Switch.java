package Area;

import java.util.*;

public class Switch {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of between 1 to 5 ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Ceram");
				break;
			case 2:
				System.out.println("Criket");
				break;
		    
			case 3:
				System.out.println("Ludo");
				break;
		    
			case 4:
				System.out.println("mukkabaj");
				break;
		    
			case 5:
				System.out.println("kabaddi");
				break;
		    
				default:
					System.out.println("Invalid input please enter the input between 1 to 5");
				
		}
		

	}

}
