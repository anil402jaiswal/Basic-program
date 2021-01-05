package gauravSirPrograms;


public class HW2 {

	public static void main(String[] args) {
		
		int arr[] = {9,16,20};
		int sum= sumi(arr);
		System.out.println("Sum of missing no. = "+sum);
		
		
		
	}
		static int sumi(int brr[])
		{
	
			int x=brr[0];
			int total = 0;
			
			for(int i=x+1; i<brr[2]; i++)
			{
				if(i==brr[i]) 
				{ continue;   }
				
					total = total+i;
				
				
			}
				
			
			
			
			
			return total;
		}
		
		
	

}
