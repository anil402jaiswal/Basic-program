package gauravSirPrograms;

public class Missing_no {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7};
		int ln=a.length;
		int largest= maxi(a,ln);
		System.out.println("The missing no. is "+largest);
	}

	static int maxi(int b[], int ln)
	{
		int miss;
	int sum= (ln+1)*(ln+2)/2;
	for(int i=0;i<ln;i++)
	{
	sum=sum-b[i];
				
	}
	
	return sum;
}
	
	}




// only for sequential array