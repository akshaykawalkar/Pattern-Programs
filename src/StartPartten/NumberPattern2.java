package StartPartten;

public class NumberPattern2 {

	public static void main(String[] args) {

		int i, j, k = 1;  
		for (i = 1; i <= 7; i++)//1,2,3
		{  
		for (j = 1; j< i + 1; j++) //2 ,3, 4
		{  
		System.out.print(k++ + " ");  //1
		}                             //2 3 
		                              //4 5 6 
		System.out.println();  
		}  
		}  
		
	

}
