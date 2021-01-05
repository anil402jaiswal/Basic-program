package Area;

public class Redious {

	public static void main(String[] args) {

		

   double sum=0;
	double rds=0.0;
	for(int i=9; i<= 40; i++ )
	{
		sum=sum+i;
		
	}
	System.out.println("Sum = "+sum);
		rds = sum/3.14;
		double ans = Math.pow(rds, 0.5) ;
	 
		System.out.println("The redius = "+ans);
		
		
	}

}
