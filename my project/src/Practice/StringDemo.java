package Practice;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String sc = new String("Technocarts institute");
		int n = sc.length();
		int sum=0;
		for(int i=0; i<n-1;i++ )
		{
			sum = sum+i;
		}
          if(sum%2==0 || sum%4==0)
          {
        	  String Resualtant = "bhopal".concat(sc).concat("Electronis and communication");
        	  System.out.println(Resualtant);
          }
          else 
          {
        	  System.out.println("String is valid");
          }
	}
}
