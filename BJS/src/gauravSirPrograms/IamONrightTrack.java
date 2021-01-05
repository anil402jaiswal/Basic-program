package gauravSirPrograms;
public class IamONrightTrack {
public static void main(String[] args) {

int arr[]= {1,2,3,4,5,7,8,9};
int ln=arr.length;
     int mini = min(arr);
     int maxi = max(arr);
     int missing = miss(arr,ln);
     System.out.println("Minimum no. is ="+mini);
     System.out.println("Maximum no. is ="+maxi);
     System.out.println("Missing no. is ="+missing);
     
     int z=maxi-mini;
     System.out.println("The diffrence of maximum and minimun is = "+z);
     
     if(z>missing)
      System.out.println("I am on Right track");
     else
    	 System.out.println("I am doing everything apart from study");
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
	
	static int max(int arr[])
	{
		int max=arr[0];
		for(int i=1; i<arr.length;i++ )
		{
			if(max<arr[i])
				max=arr[i];
				}
		return max ;
	}
	static int miss(int b[], int ln)
	{
	int sum= (ln+1)*(ln+2)/2;
	for(int i=0;i<ln;i++)
	{
	sum=sum-b[i];
	}
	return sum;
}}