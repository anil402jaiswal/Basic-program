package gauravSirPrograms;

public class Elips {

	public static void main(String[] args) {
		
		int sum=0;
		int z=0;
		int x=0;
		double y=0;
		double elips=0;
		
		
		for(int i=2; i<=20; i++)
		{
			z = z+i;
			
			}
		
		System.out.println("Sum = "+z);
		x= z-7;
		System.out.println("Subtract 7 in sum = "+x);
		
		y =  ((z*z)+(x*x))/Math.pow((x+z),2);
		System.out.println("The value of Y = "+y);
		
		
		elips=3.14*y*z;
		System.out.println("The area of Elips = "+elips);
			
       }

      }
