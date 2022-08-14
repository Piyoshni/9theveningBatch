package LogicalProgramme;

public class Reverseinteger {

	public static void main(String[] args) {
		int a= 1234;
		String s = Integer.toString(a);
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 r = r+s.charAt(i);
		}
		int rev = Integer.parseInt(r);
	System.out.println("original number is "+a);
	System.out.println("Reverse number is "+rev);
	
	}
	
	

}
