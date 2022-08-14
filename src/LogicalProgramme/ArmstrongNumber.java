package LogicalProgramme;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the nummber");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int c;
	    c=n;
		int r,arm=0;
	while(n>0)
	{
      r= n%10;
      arm=r*r*r+arm;
      n=n/10;
	}
if(c==arm)
{
	System.out.println("Given number is armstrong");
}
else
{
	System.out.println("Given number is not armstrong");
}
}
}