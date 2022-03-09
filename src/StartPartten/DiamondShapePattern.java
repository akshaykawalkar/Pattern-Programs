package StartPartten;
    

public class DiamondShapePattern {

	public static void main(String[] args) {
		int i,j,row =6;
		for(i=0;i<row;i++) 
		{
			for( j=row-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for( j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//System.out.print(" ");
		for(i=0;i<5;i++) 
		{
			for( j=5-i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for( j=5;j>i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

