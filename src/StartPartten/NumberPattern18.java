package StartPartten;
//1 2 3 4 5 6 7 8 9 1 
//2 3 4 5 6 7 8 9 1 2 
//3 4 5 6 7 8 9 1 2 3 
//4 5 6 7 8 9 1 2 3 4 
//5 6 7 8 9 1 2 3 4 5 
//6 7 8 9 1 2 3 4 5 6 
//7 8 9 1 2 3 4 5 6 7 
//8 9 1 2 3 4 5 6 7 8 
//9 1 2 3 4 5 6 7 8 9 

public class NumberPattern18 {

	public static void main(String[] args) {
     int a=0;
       for(int i=1;i<=9;i++)
    	   
       {a++;
    	   for(int j=i; j<=9;j++)
    	   {
    		   System.out.print(j+" ");
    	   }
       
    	   for(int j=1; j<=a;j++)
    	   {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
	}

}
