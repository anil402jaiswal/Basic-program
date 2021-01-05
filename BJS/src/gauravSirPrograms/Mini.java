package gauravSirPrograms;
import java.util.Scanner;

public class Mini {

	public static void main(String[] args) {
		
		
		//Without method
	/*	int  arr[] = {6,28,24,98,5,19};
		
		int min = arr[0];
		for(int i=1; i<arr.length;i++)
			
		{
			if(min > arr[i])
				min=arr[i];
		}
		System.out.println(min);
		*/
		
		
		//Without mathod
int arr[]= {2,10,6,49,9,78};

     int mini = min(arr);
     System.out.println("Maximum no. is "+mini);
     
}
	static int min(int arr[])
	{
		int mini=arr[0];
		for(int i=1; i<arr.length;i++ )
		{
			if(mini>arr[i])
				mini=arr[i];
				
		}
		return mini ;
	}
	
	
	}