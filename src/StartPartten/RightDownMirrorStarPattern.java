package StartPartten;

public class RightDownMirrorStarPattern {

	public static void main(String[] args) {

		for(int i=0; i<=6; i++)
		{
			for(int a=0;a<i; a++)
			{
				System.out.print(" ");
			}
			for(int j=6 ;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
