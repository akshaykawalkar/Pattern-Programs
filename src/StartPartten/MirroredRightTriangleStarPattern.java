package StartPartten;

public class MirroredRightTriangleStarPattern {

	public static void main(String[] args) {
		for(int i=0; i<=6;i++)
		{
			for(int y=5; y>=i; y--) {
				System.out.print(" ");
			}
			for(int j=0; j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
