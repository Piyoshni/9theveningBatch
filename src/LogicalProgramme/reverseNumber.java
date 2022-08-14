package LogicalProgramme;

public class reverseNumber {

	public static void main(String[] args) {
		int a=1234;
		int b=0;
		for(int i=a;i>0;i=i/10)
		{
			int c=a%10;
			b=b*10+c;
			
		}
System.out.println("reverse number is"+b);
	}

}
