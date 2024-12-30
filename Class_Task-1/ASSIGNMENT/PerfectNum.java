package PerfectNum;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long n,sum=0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number:");
n=scan.nextLong();

int i=1;
while(i<=n/2)
{
	if(n%i==0)
	{
		sum=sum+i;
	}
i++;
	}
if(sum==n)
{
	System.out.println( n + " is a Perfect Number.");
}
else
{

	System.out.println(n + " is not a Perfect Number.");
}
	}

}
