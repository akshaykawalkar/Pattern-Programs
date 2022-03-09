package StartPartten;

public class RightPascalsTriangle {

	public static void main(String[] args) {
 
		int i,j,row=6;
		for(i=0;i<row;i++) 
		{
			for(j=0 ;j<=i;j++)
			{
				System.out.print("* ");
			}
        System.out.println();
        }
		for(i=0;i<5;i++)
		{
			for(j=5;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
