package LogicalStartpattern;

public class SP6 {

	public static void main(String[] args) {
		//   *
//          ***
//         *****
//        *******
	//	 *********
//        *******
//         *****
//          ***
//		     **
		//   *
		 int space=3;
		   int star=1;
		   for(int i=1;i<=4;i++)
		   {
			   for(int j=1;j<=space;j++)
			   {
				   
				   System.out.print(" ");
			   }
			   for(int k=1;k<=star;k++)
			   {
				   System.out.print("*");
			   }
			   space--;
			   star=star+2;
			   System.out.println();
			   
		   }
		 for(int i=4;i<=1;i++)
		  {
			 for(int j=1;j<=space;j++)
			 {		 
			 System.out.print(" "); 
			 }
			 for(int k=1;k<=star;k++)
			 {
				 System.out.print("*");
			 }
			 space++;
			 star=star-2;
		  }
		 
	}
}
	
	
	
	
	
	
