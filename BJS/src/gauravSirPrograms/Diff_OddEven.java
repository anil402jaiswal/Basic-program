package gauravSirPrograms;

public class Diff_OddEven {


		static int maxi(int arr[])
		{
			int max=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(max<arr[i])
					max=arr[i];
			}
			return max;
		}
	
		static int mini(int arr[])
		{
			int mini=arr[0];
			for(int i=1;i<arr.length;i++)
				if(mini>arr[i])
					mini=arr[i];
			return mini;
		}
		
		static int even(int arr[])
		{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				sum+=arr[i];
			}
		return sum;
		}
		                                        
		static int odd(int arr[])
		{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				sum+=arr[i];
			}
		return sum;
		}
		
		public static void main(String[] args) {
			
			int arr[] = {30,1,2,3,4,5,6,7,12};
			int max= maxi(arr);
			int min = mini(arr);
			int sumEven = even(arr);
			int sumOdd = odd(arr);
			
			System.out.println("Maximum no. is " +max);
			System.out.println("Minimum no. is " +min);
	        System.out.println("Sum of even no. is " +sumEven);
	        System.out.println("Sum of odd no. is " +sumOdd);
			
			
			int x[] = new int[4];
			x[0]= min;
			x[1]= max;
			x[2]= sumEven;
			x[3]= sumOdd;
			
			int z=x[0];
			for(int i=1;i<4;i++)
			{
				if(z<x[i])
					z=x[i];
		}
			int y = z+sumEven;
			System.out.println("Resultent = "+y);
			
			for(int i= 2;i<y;i++)
			{
				if(y%i != 0)
				{
					System.out.println("Resultent is a prime no.");
				break;
				}
				if(y%i == 0)
					{
					System.out.println("Resultent is not a prime no.");
					break;
					}
			
			}
					                                                                                
	}
}


