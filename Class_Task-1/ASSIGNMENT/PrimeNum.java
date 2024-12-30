package PrimeNum;


public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1 = 10, n2 = 20;
for (int i = n1; i <= n2; i++)
	if (isPrime (i))
		System.out.println (i);
	   }
	static boolean isPrime (int n)
	   {
		int count = 0;
		if (n < 2)
			return false;
	     for (int i = 2; i < n; i++)
	     {
	    	 if (n % i == 0) 
	    		 return false;
	       }

	     return true;
	   }
	 }