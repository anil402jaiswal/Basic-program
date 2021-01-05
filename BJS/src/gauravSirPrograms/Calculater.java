package gauravSirPrograms;
import java.util.Scanner;

public class Calculater {
	
public static void main(String[] args) {
	
System.out.println("Enter the values of n1 , n2");
Scanner sc = new Scanner(System.in);
double n1 = sc.nextDouble();
double n2 = sc.nextDouble();
double result=0;
System.out.println("enter your choice");

System.out.println("1.... Addition");
System.out.println("2.... subtraction");
System.out.println("3.... Multiplication");
System.out.println("4.... Divition");

int choice = sc.nextInt() ;
					
switch(choice)
{
case 1:
	result=n1+n2;
	break;
case 2:
	result = n1-n2;
	break;
case 3:
	result = n1*n2;
	break;
case 4:
	result = n1/n2;
	break;
	default:
		System.out.println("Invalid input");
	}
System.out.println("the result= "+result);

}}
