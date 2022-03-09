package StartPartten;



public class DiamondCharacterPattern {

	public static void main(String[] args) {
    char a='A';
    char b='K';
   for(int i=1; i<=11; i++)//1
   {
	   for(int j=10;j>=i;j--)//8s
	   {
		   System.out.print(" ");
	   }
	   for(int k=1;k<=i;k++)//2k,3k,4k
	   {
		   if(k==1||k==i)
		   {
			   System.out.print(a+" ");
		   }
		   else
			   
		   {
			   System.out.print("  ");
		   }
		  
	   }
	   System.out.println();
	   a++;
   }
   
   for(int i=1; i<=11; i++)//1
   {
	   b--;
	   for(int j=1;j<=i;j++)//8s
	   {
		   System.out.print(" ");
	   }
	   for(int k=10;k>=i;k--)//2k,3k,4k
	   {
		   if(k==10||k==i)
		   {
			   System.out.print(b+" ");
		   }
		   else
			   
		   {
			   System.out.print("  ");
		   }
		  
	   }
	   System.out.println();
	   a++;
   }
	}

}
