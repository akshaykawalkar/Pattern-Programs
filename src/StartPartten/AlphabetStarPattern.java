package StartPartten;
//**** 
//*   *
//*   *
//*   *
//*****
//*   *
//*   *
//*   *
//*   *

public class AlphabetStarPattern {

	public static void main(String[] args) {
		int i, j, n=8;  
		
		for (i = 0; i<=n; i++)//0   
		{  
	
		for (j = 0; j<= 4; j++)   //0,1
		{  
	
		if (i==0||i==4||j==0||j==4)   
		System.out.print("*");  
		else  
		System.out.print(" ");  
		}  
		System.out.println();  
		}  
		
	}

}
