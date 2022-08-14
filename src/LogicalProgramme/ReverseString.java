package LogicalProgramme;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// eg -velocity
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String name = sc.next();
		String r="";
		for(int i=name.length()-1;i>=0;i--)
		{
			 r=r+name.charAt(i);
		}
System.out.println("Reverse String is "+r);
	}

}
