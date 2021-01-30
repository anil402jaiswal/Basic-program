package Practice;

public class StringPreDefineMethod {

	public static void main(String[] args) {
		String s = new String("I am anil who are you anil is anil not sunil is anil");
		System.out.println(s.replace("anil", "sunil"));   // sabhi anil ko sunil se replace krega
		System.out.println(s.replaceFirst("anil", "pankaj")); // only First anil ko pankaj se replace krega
		System.out.println(s.replaceAll("anil(.)", "shashank"));  //anil ke bad ka ek charector remove kr dega or anil ki jagah shashank print krega
		System.out.println(s.replaceAll("anil(.*)", "shashank")); /* anil ki ke bad jo bhi he sabhi ko replace kr dega and frist
		                                                                     anil ko shashank se replace krega*/
		
		System.out.println(s.substring(3,17));   //3+1 posotion se lekr 17ve position tak print krega
		System.out.println(s.substring(5, 13));  
		
		System.out.println(s.indexOf("anil"));        //anil ki index value btaega
		System.out.println(s.contains("s"));      //chack krega string me "s" he ya nhi
		System.out.println(s.charAt(3));      // uss index ki value dega
		System.out.println(s.startsWith("I"));      // chack string start with I or not    only return true of false 
		System.out.println(s.endsWith("anil"));    // chack string end with anil or not    only return true of false 
		System.out.println(s.toUpperCase());        //convert upper case
		System.out.println(s.toLowerCase());            //convert lower case
		int a=10; int b=20; int c=30;
		System.out.println(a+b+c);
		String s1 = String.valueOf(a);     // covert any variable to string
		String s2 = String.valueOf(b);
		String s3 = String.valueOf(c);
		System.out.println(s1+s2+s3);
      char[] d= s.toCharArray();       //convert String to char array
      System.out.println(d[0]);
		
	}
}
