package LogicalProgramme;

public class SpaceCounter {

	public static void main(String[] args) {
	String s="I Love My India";
	int count=0;
	
	for(int i=0;i<=s.length();i++)
	{
		char blank=s.charAt(i);
	//	if(blank=='')
		{
			count++;
		}
	}
	System.out.println("Total space in String are ");
	}

}
