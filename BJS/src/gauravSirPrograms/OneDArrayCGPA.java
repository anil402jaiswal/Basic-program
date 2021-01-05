package gauravSirPrograms;
import java.util.Scanner;

public class OneDArrayCGPA {

	public static void main(String[] args) {
  int sum=0;                                                          
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of subject");
		int subject = sc.nextInt();
		System.out.println("The totle no. of Subject ="+subject);
		
		int arr[] = new int[subject];
		System.out.println("Enter the marks of subject between 0-100");
		for(int i=0 ; i<subject ; i++)
		{
			
			System.out.println("Enter the no. on the "+i+"th position");
			arr[i] = sc.nextInt();
		  sum+=arr[i];	
		}
		
		System.out.println("Totle no. of all subject = "+sum);
		
		double per =  (sum*100)/(subject*100);
		System.out.println("The persentage is = " +per);
		
		double CGPA= per/10;
		 
		System.out.println("CGPA is "+CGPA);
		
		if(CGPA <4.0)
			System.out.println("Fail");
		
		else if( CGPA>=4.0 &&  CGPA <6.0)
			System.out.println("D Grade");
		
		else if(CGPA >= 6.0 && CGPA < 7.0)
			System.out.println("C Grade");
		
		else if(CGPA>=7.0 && CGPA < 8.0)
			System.out.println("B Grade");
		
		else if(CGPA >= 8.0 && CGPA < 9.0)
			System.out.println("B Grade");
		else if(CGPA>=9.0 && CGPA<=10.0)
			System.out.println("A++ Grade");
		else 
			System.out.println("Wrong Answer");
			
		
		
		
		
		

	}

}
