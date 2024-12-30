package Permutations;
import java.util.Scanner;
public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = scanner.next();
scanner.close();
generatePermutations(str, 0, str.length() - 1);
}
	
public static void generatePermutations(String str, int left, int right) 
{
	if (left == right) 
	{
		System.out.print(str + " ");
      } 
	else 
	{
		for (int i = left; i <= right; i++) 
		{
                str = swap(str, left, i);
                generatePermutations(str, left + 1, right);
                str = swap(str, left, i); 
            }
        }
    }

 public static String swap(String str, int i, int j) 
 {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

	}


