package StartPartten;

public class NumberPattern6 {

	public static void main(String[] args) {

		int k=0;
		for(int i=0; i<9;i++)
		{ 
		
			for(int j=0;j<9;j++)
			{
				k++;
				if(k%2==0)
				System.out.print(0);
			
			else
			{
				System.out.print(1);
			}
			}
			System.out.println();
		}
	}

}
