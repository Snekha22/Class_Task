package S_element;

import java.util.Arrays;
import java.util.Scanner;
public class S_element {

	public static void main(String[] args)
	{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter array size: ");
int n = scanner.nextInt();
int[] array = new int[n];

System.out.println("Enter array elements:");
for (int i = 0; i < n; i++)
{
	array[i] = scanner.nextInt();
	}

System.out.print("Enter K: ");
int k = scanner.nextInt();

scanner.close();

Arrays.sort(array);

int kthSmallest = array[k - 1];
int kthLargest = array[n - k];

System.out.println(k + "th smallest element: " + kthSmallest);
System.out.println(k + "th largest element: " + kthLargest);
}
		
	}


