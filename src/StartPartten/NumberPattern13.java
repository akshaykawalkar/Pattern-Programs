package StartPartten;
//1 
//1 2 1 
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
//1 2 3 4 5 6 5 4 3 2 1 
//1 2 3 4 5 6 7 6 5 4 3 2 1 
//1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
//1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

public class NumberPattern13 {
	public static void main(String [] ak)
	{

	for(int i=1;i<=9;i++)//4
	{
		for(int j=1;j<=i;j++)//1 2 3 4
		{
			System.out.print(j+" ");
		}
		for(int k=i-1;k>=1;k--)// 3 2 1
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
	}
}
