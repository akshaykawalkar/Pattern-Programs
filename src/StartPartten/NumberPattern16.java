package StartPartten;
//11111111
//11111122
//11111333
//11114444
//11155555
//11666666
//17777777
//88888888

public class NumberPattern16 {
	public static void main(String [] args)
	{
		for(int i=1;i<9;i++)//1
		{
			for(int j=8;j>i;j--)//8,7,6,5,4,3,2
			{
				System.out.print(1);
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
