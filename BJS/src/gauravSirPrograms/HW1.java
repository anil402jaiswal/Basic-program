package gauravSirPrograms;

public class HW1 {

	public static void main(String[] args) {
	int arr[]= {30,2,4,9,5,76,34,65,12};
	int max=maxi(arr);
	System.out.println("Maximum no. of 1st array"+max);
	}
	
	static int maxi(int brr[])
	{
		int temp=brr[0];
		for(int i=1;i<brr.length;i++)
		{
			if(temp<brr[i])
				temp=brr[i];
             
		}
		return temp;
	}
	
	

}
