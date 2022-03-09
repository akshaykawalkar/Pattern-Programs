package StartPartten;

//1
//10
//101
//1010
//10101
//101010
//1010101
//10101010
//101010101

public class NumberPattern7 {

	public static void main(String[] args) {

		for(int i=1;i<=9;i++)//0
		{ int k=0;
			for(int j=i;j>=1;j--)//0
			{
				k++;
				if(k%2==0) 
				{
				System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}
	}

}
