package StartPartten;

public class LeftPascalsTriangle {

	public static void main(String[] args) {

		int i,j, row=8;
		for(i=0;i<row;i++)
		{
			for(j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=0;i<row-1;i++)
		{
			for(j=0;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(j=row-1;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
