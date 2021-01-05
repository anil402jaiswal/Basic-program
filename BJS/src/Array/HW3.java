package Array;

public class HW3 {

	public static void main(String[] args) {
		
		int sem1[]= {76,98,46,58};
		int x= semi1(sem1);
		System.out.println("Sumition is = "+x);
		
		int sem2[]= {77,69,40,86};
		int y= semi2(sem2);
		System.out.println("Sumition is = "+y);
		
		int z = bitwise(sem1, sem2);
		System.out.println("the resultent of all bitwise opration is "+z);
		}
  
	@SuppressWarnings("unused")
	static int semi1(int sem1[])
	{
		int total = 0;
		int temp=sem1[0];
		for(int i=0;i<sem1.length;i++)
		{
			total=total+sem1[i];
		}
		return total;
	}
	
		@SuppressWarnings("unused")
		static int semi2(int sem2[])
	{
		int total = 0;
		int temp=sem2[0];
		for(int i=0;i<sem2.length;i++)
		{
			total=total+sem2[i];
		}
		return total;
	}
	
	static int bitwise(int sem1[], int sem2[]) 
	{
		int z=0;
		int temp=0;
		int x=0;
		
		for(int i=0; i<4;i++)
		{
			int a = sem1[i] & sem2[i] ;
		}
		
		
		return z;
	}	
	
	
	
	
	
}
