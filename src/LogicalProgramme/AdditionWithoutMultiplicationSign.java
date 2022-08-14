package LogicalProgramme;

import java.util.Scanner;

public class AdditionWithoutMultiplicationSign {

	public static void main(String[] args) {
	//	System.out.println("Enter the number");
	//	Scanner sc=new Scanner(System.in);
		int num1=3;
		int num2=5;
		int sum=0;
		for(int i=1;i<=num2;i++)
		{
			sum =num1+sum;
		}
System.out.println("The multiplication of two number is "+sum);
	}

}
