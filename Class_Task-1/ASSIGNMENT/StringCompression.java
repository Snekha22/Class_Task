package StringCompression;
import java.util.Scanner;
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String input = scanner.nextLine();
scanner.close();
String compressed = compressString(input);
System.out.println("Compressed string: " + compressed);
}

public static String compressString(String input)
{
if (input.isEmpty())
{
	return "";
	}
StringBuilder compressed = new StringBuilder();
char currentChar = input.charAt(0);
int count = 1;
for (int i = 1; i < input.length(); i++) 
{
	char nextChar = input.charAt(i);
	if (nextChar == currentChar)
	{
		count++;
		}
	else
	{
		compressed.append(currentChar).append(count);
		currentChar = nextChar;
		count = 1;
		}
	}
compressed.append(currentChar).append(count);
return compressed.toString();
}
	
	}


