package StartPartten;

public class TriangleStarPattern {
	



		public static void main(String[] args)  
		{  
		int i, j, k, rows=9;  
		for (i=1; i<= rows ; i++)  //1,2,3,4,5,6,7,8,9
		{  
		for (j = i; j < rows ; j++)  //1,2,3,4,5,6,7,8,9
		{  
		System.out.print(" ");  // 8s,7s,6s,5s,4s,3s,2s,1s, 0s
		}     
		for (k = 1; k <= (2*i-1) ;k++)   //2k, 3k, 5k, 7k, 9k, 11k, 13k, 15k, 17k
		{  
		if(k==1 || i == rows || k==(2*i-1))   
		{  
		System.out.print("*");  
		}  
		else   
		{  
		System.out.print(" ");  
		}  
		}  
		System.out.println("");  
		}  
		
	}

}
