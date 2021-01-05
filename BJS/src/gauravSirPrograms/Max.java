package gauravSirPrograms;

public class Max {

	public static void main(String[] args) {
		int a[] = {87,21,131,13,45,568};
		int largest= maxi(a);
		System.out.println("The largest no. is "+largest);
	}

	static int maxi(int b[])
	{
		int max=b[0];
	for(int i=1;i<b.length;i++)
	{
	if(max<b[i])
		max=b[i];
				
	}
	
	return max;
}
	
	}