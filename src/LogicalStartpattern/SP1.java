package LogicalStartpattern;

public class SP1 {

	public static void main(String[] args) {
//		                *
//		               **
//		              ***
//		             ****
//		            *****
		int i,j,k;
		int star=1;
		int space=4;
		for( i=1;i<=5;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			space--;
			star++;
			System.out.println();
		}

	}

}
