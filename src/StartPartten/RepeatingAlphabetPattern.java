package StartPartten;

//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
//F F F F F F 
//G G G G G G G 

public class RepeatingAlphabetPattern {

	public static void main(String[] args) {
		char k='A';
		for(int i=1;i<8;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			k++;
		}
	}

}
