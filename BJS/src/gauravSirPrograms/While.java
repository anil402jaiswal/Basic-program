package gauravSirPrograms;

public class While {

	public static void main(String[] args) {
	
		int n=1;
		int sum=0;
		int i=1;
		
		
	/*
	 Submition till 7
	  	while(n<15)
		{
			sum=sum+i;
			i++;
			if(i==8) {
				break;
			
			}
		}
		System.out.println("sum = "+sum);
		
		*/
		while(n<15)
		{
			sum=sum+i;
			i++;
			if(i==7) {
				continue;
			}
		}
		System.out.println("sum = "+sum);
	}

}
