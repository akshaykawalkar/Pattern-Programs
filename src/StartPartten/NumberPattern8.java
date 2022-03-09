package StartPartten;

//1 2 3 4 5 6 7 8 9 10 
//2 3 4 5 6 7 8 9 10 
// 3 4 5 6 7 8 9 10 
//  4 5 6 7 8 9 10 
//   5 6 7 8 9 10 
//    6 7 8 9 10 
//     7 8 9 10 
//      8 9 10 
//       9 10 
//        10 
//       9 10 
//      8 9 10 
//     7 8 9 10 
//    6 7 8 9 10 
//   5 6 7 8 9 10 
//  4 5 6 7 8 9 10 
// 3 4 5 6 7 8 9 10 
//2 3 4 5 6 7 8 9 10 
//1 2 3 4 5 6 7 8 9 10 
public class NumberPattern8 {

	public static void main(String[] args) {
		int a=10;
		for(int i=1; i<=10;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=10;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		for(int i=1;i<10;i++)
		{ 
		a--;
			for(int j=9;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=a; k<=10;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
