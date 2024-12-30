package zigzag;
import java.util.Scanner;
public class Zigzag {

	public static void main(String[] args)
	{
		
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = scanner.nextInt();

scanner.close();
int start = 1;
int end = n;
while (start <= end) 
{
		          
System.out.print(start + " ");
		          
if (start != end) 
	{
	System.out.print(end + " ");
	}
start++;
end--;
}		    
		
}

}
