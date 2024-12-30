package LcmGcd;
import java.util.Scanner;
public class LcmGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter two numbers: ");
int num1 = scanner.nextInt();
int num2 = scanner.nextInt();
scanner.close();

int gcd = computeGCD(num1, num2);
int lcm = computeLCM(num1, num2, gcd);

System.out.println("GCD: " + gcd);
System.out.println("LCM: " + lcm);
}
	
public static int computeGCD(int num1, int num2)
{
	if (num2 == 0)
	{
		return num1;
		}
	return computeGCD(num2, num1 % num2);
	}

public static int computeLCM(int num1, int num2, int gcd)
{
	return (num1 * num2) / gcd;
	}
	
}


