package Array;

public class HW2 {

	public static void main(String[] args) {
		
		int arr[] = {4,7,10,12};
		int sum= sumi(arr);
		System.out.println("Sum of missing no. = "+sum);
		}
		static int sumi(int brr[])
		{
	
			int x=brr[0];
			int total = 0;
			int j=0;
			for(int i=x; i<brr[3]; i++)
			{
				if(i==brr[j]) 
				{
					j++;
					continue;   }
				else 
				{
					total = total+i;
				}
				
			}
		
			return total;
		}
		
}
