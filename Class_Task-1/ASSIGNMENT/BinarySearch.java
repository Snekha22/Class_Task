package BinarySearch;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter array size: ");
int size = scanner.nextInt();
int[] array = new int[size];

System.out.println("Enter sorted array elements:");
for (int i = 0; i < size; i++)
{
	array[i] = scanner.nextInt();
	}
System.out.print("Enter the element to search: ");
int target = scanner.nextInt();
scanner.close();
int result = binarySearch(array, target);
if (result == -1)
{
	System.out.println("Element not found in the array.");
	}
else
{
	System.out.println("Element found at index " + result + ".");
	}
}
	public static int binarySearch(int[] array, int target)
	{
		int left = 0;
		int right = array.length - 1;

		while (left <= right)
		{
			int mid = left + (right - left) / 2;
            if (array[mid] == target) 
            {
            	return mid;
	            }
            else if (array[mid] < target)
            {
            	left = mid + 1;
	            }
            else
            {
     
	                right = mid - 1;
	            }
	        }
		return -1; 
	    }
	
	}

