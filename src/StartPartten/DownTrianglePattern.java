package StartPartten;

public class DownTrianglePattern {

	public static void main(String[] args) {
		int a=8;
		for(int i=0;i<9;i++)//0,1,2,3
		{  	
			for(int j=0;j<i;j++)//0s,1s,2s,3s
			{
				System.out.print(" ");
			}
			for(int k=0;k<(9-i);k++)//8k,7k, 6k, 5k
			{
				

				if(i==0||k==0||k==9-(i+1)) {
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				//System.out.println();
			}
			
		System.out.println();	
			
		}
	}

}
