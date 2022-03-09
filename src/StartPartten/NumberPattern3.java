package StartPartten;

public class NumberPattern3 {
	           
		public static void main(String[] args)   
		{
			int a=4;
			for(int i=1; i<=4;i++)
			{
				for(int j=6 ;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=i;k>=1;k--)//
				{
					System.out.print(k);
				}
				for(int j=2;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
			for(int i=1; i<4; i++)//1
			{
				a--;
				for(int j=3;j<5+i;j++)
				{
					System.out.print(" ");
				}
				for(int k=a;k>=1;k--) 
				{
					System.out.print(k);
				}
				for(int l=2;l<=a;l++)//1
				{
					System.out.print(l);
				}
				System.out.println();
			}
		}
	

}
