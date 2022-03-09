package StartPartten;
//1 
//2 10 
//3 11 18 
//4 12 19 25 
//5 13 20 26 31 
//6 14 21 27 32 36 
//7 15 22 28 33 37 40 
//8 16 23 29 34 38 41 43 
//9 17 24 30 35 39 42 44 45 
public class NumberPattern17 {

	public static void main(String args[])  
	{  
	int rows=9;  
	for (int i = 1; i <= rows; i++)  //1,2,3,4
	{  
	int num = i;  
	for (int j = 1; j <= i; j++)   //1,2, 3, 4
	{  
	System.out.print(num+" ");  //1 (=1+9-1=9)
	num = num+rows-j;          // 2 2+9-1=10
	}                          // 3 3+9-1=11 11+9-2=18
	System.out.println();      // 4 4+9-1=12 12+9-2=19 19+9-3=25
	}  
	}  
	}  
