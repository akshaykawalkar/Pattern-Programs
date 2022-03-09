package StartPartten;
//        A 
//       A B 
//      A B C 
//     A B C D 
//    A B C D E 
//   A B C D E F 
//  A B C D E F G 
// A B C D E F G H 

public class TriangleCharacterPattern {

	public static void main(String[] args) {
		for(int i=1;i<9;i++)
		{ char k='A';
		
		for(int a=9;a>=i;a--)
		{
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
