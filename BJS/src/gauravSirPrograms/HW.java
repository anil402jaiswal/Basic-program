package gauravSirPrograms;

public class HW {

	public static void main(String[] args) {
	
		String arr[]= {"Anil", "Dinesh", "Shashank", "Abhisek", "Basant", "Ankit"};
		  int max=arr[0].length();
		  String brr[]=new String[1];
		  brr[0]=arr[0];
		for(int i=1; i<6;i++)
		{
			if(brr[0].length()<arr[i].length())
				brr[0]=arr[i];
		}
		
		System.out.println(brr[0]);
	}

}
