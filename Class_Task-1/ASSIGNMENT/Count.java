package Count;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan= new Scanner(System.in);
System.out.println("Enter a Numbers:");
int n= scan.nextInt();

int Count=0;
while(n!=0)
{
n=n/10;
Count++;

}
System.out.println("Number of digits:" + Count);
	}

}
