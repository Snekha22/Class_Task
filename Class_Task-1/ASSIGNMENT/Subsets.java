package Subsets;
import java.util.Scanner;
public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the array size: ");
int n = scanner.nextInt();
int[] array = new int[n];

System.out.println("Enter the elements:");

for (int i = 0; i < n; i++)
{
	array[i] = scanner.nextInt();
	}
scanner.close();
generateSubsets(array);
    }

	public static void generateSubsets(int[] array) 
	{
        int n = array.length;
        int max = 1 << n; 
        System.out.println("Subsets:");
        for (int i = 0; i < max; i++)
        {
            System.out.print("[");
            for (int j = 0; j < n; j++) 
            {
                if ((i & (1 << j)) != 0) 
                {
                    System.out.print(array[j] + " ");
                }
            }
            System.out.print("]");
        }
    }

	}


