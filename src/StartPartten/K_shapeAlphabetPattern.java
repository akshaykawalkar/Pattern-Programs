package StartPartten;

//A B C D E F G H I 
//A B C D E F G H 
//A B C D E F G 
//A B C D E F 
//A B C D E 
//A B C D 
//A B C 
//A B 
//A 
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F 
//A B C D E F G 
//A B C D E F G H 
//A B C D E F G H I 
public class K_shapeAlphabetPattern {

	public static void main(String[] args) {
		for(int i=9;i>=1;i--)
		{ char k='A';
			for(int j=i;j>=1;j--)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		for(int i=1;i<=9;i++)
		{ char k='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
