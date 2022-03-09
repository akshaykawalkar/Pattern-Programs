package StartPartten;
//123456789
//23456789
// 3456789
//  456789
//   56789
//    6789
//     789
//      89
//       9
//      89
//     789
//    6789
//   56789
//  456789
// 3456789
//23456789
//123456789

public class NUmberPattern15 {
	public static void main(String [] args)
	{ int a=9;
		for(int i=1; i<=9;i++)
			
		{
			
			for(int k=1; k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=9;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
        for(int i=1; i<=8;i++)
			
		{
			a--;
			for(int k=8; k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=a; j<=9;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
