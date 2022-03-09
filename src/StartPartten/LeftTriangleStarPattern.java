package StartPartten;

	public class LeftTriangleStarPattern {
	
		public static void main(String[] args) {
		   for(int i=0 ;i<=5; i++) //row
		   {
			 for(int a=5; a>i;a--) //space
			  {
		      System.out.print(" ");
			  }
			for(int j=0 ;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		   }
		}

}
//	     *
//	    **
//	   ***
//	  ****
//	 *****
//	******
