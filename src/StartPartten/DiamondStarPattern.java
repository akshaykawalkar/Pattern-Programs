package StartPartten;

public class DiamondStarPattern {

	public static void main(String[] args) {

		for(int i=0 ;i<10;i++)
		{
			for(int j=10; j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i+1 ;k++)
			{
				if(k==1||k==i+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		for(int i=1; i<=9; i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=9; k>=i;k--)
			{
				if(k==9||k==i||k==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
