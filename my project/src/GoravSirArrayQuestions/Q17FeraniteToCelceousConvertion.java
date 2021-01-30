package GoravSirArrayQuestions;

import java.util.Scanner;

public class Q17FeraniteToCelceousConvertion {

	public static void main(String[] args)
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter is temprature in Feranite");
	
        double fa = ob.nextDouble();
        if(fa>0)
        {
        double C = ((fa - 32)*5)/9;
        System.out.println("The temprature in celceous "+C);
        
	}
	}

}
