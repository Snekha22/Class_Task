package MaxProduct;
import java.util.Scanner;
public class MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the array size: ");
int n = scanner.nextInt();
int[] array = new int[n];

System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
	array[i] = scanner.nextInt();
      }
scanner.close();
int maxProduct = findMaxProduct(array);

System.out.println("Maximum product: " + maxProduct);
    }
	
public static int findMaxProduct(int[] array) 
	{
        int maxProduct = array[0];
        int minProduct = array[0];
        int result = array[0];

        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] < 0) 
            {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(array[i], maxProduct * array[i]);
            minProduct = Math.min(array[i], minProduct * array[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

	}


