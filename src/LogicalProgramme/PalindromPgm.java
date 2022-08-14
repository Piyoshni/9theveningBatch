package LogicalProgramme;

public class PalindromPgm {

	public static void main(String[] args) {
		String s="eye";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
		  r=r+s.charAt(i);
		}
System.out.println("original string is "+s);
System.out.println("reverse string is "+r);
if(s.equals(r))
{
	System.out.println("string is palindrome");
}
else
{
	System.out.println("string is not palindrome");
}
	}

}
