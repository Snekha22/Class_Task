package Lcm;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 6, b = 8;

int lcm = findLCM(a, b);

System.out.println("LCM of " + a + " and " + b + " is " + lcm);
}
	public static int findLCM(int a, int b) 
	{ 
		int lcm = Math.max(a, b);
		while (true)
		{
			if (lcm % a == 0 && lcm % b == 0) 
			
			{
			return lcm;
			}
			lcm += Math.max(a, b);
	        }
	    }
	}
