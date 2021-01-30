package StringProgram;

public class DemoIsEmpty {

	public static void main(String[] args) {
		
		String s = new String("");
		String s1 = new String("anil");
		
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		
		String s2="Waooo";
		
		byte[] bjs = s2.getBytes();
		System.out.println(bjs[1]);
		  /* for(int i=0;i<bjs.length;i++)
		   {
		System.out.println(bjs[i]);
	}
	*/

}
}