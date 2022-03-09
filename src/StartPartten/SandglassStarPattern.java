package StartPartten;
//* * * * * * * 
//* * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     *        
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//* * * * * * 
//* * * * * * * 

public class SandglassStarPattern {

	public static void main(String[] args) {

		int i,j, row=7;
		for(i=0;i<7;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=row;j>i;j--)
			{
				System.out.print("* ");
			}
			if(i<6) {
			System.out.println();
			}
		}
		
		for(i=0; i<=row;i++)
		{
			for(j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
