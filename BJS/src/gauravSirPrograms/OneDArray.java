package gauravSirPrograms;
import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
       int sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int size= sc.nextInt();
          int arr[] = new int[size];
          
          for(int i=0; i<size ; i++)
          {
        	  System.out.println("Enter the Element in " +i+ " position" );
        	  arr[i] = sc.nextInt();
        	  sum+=arr[i];
          }
		 System.out.println("Sum of array  "+sum);
            
          int y= arr[1];
          int z = arr[1]-sum;
          System.out.println("The value of z= "+z);
          int radious = z/2;
          System.out.println("The value of radious = "+radious);
          double area = (3.14*radious*radious)/4;
          System.out.println("The area of Quater circle = " +area);
          
		

	}

}
