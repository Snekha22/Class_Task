package Prime;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter a Number:");
int n=scan.nextInt();

if(n%1==0 && n%2!=0)
{
System.out.println(n + "is a Prime Number");
}
else
{

System.out.println(n + "is Not a Prime Number");
}
	}

}
