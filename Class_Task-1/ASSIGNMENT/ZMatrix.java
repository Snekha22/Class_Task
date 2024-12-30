package ZMatrix;
import java.util.Scanner;
public class ZMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter matrix size: ");
int n = scanner.nextInt();
scanner.close();

int[][] matrix = new int[n][n];
fillZigZagMatrix(matrix);
printMatrix(matrix);
}
	
	public static void fillZigZagMatrix(int[][] matrix) 
	{
		int n = matrix.length;
		int num = 1;
		for (int i = 0; i < n; i++) 
		{
			if (i % 2 == 0)
			{
				for (int j = 0; j < n; j++)
				{
					matrix[i][j] = num++;
	                }
	            } 
			else
			{
				for (int j = n - 1; j >= 0; j--) 
				{
					matrix[i][j] = num++;
	                }
	            }
	        }
	    }

	    public static void printMatrix(int[][] matrix)
	    {
	        for (int i = 0; i < matrix.length; i++) 
	        {
	            for (int j = 0; j < matrix[0].length; j++) 
	            {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	
	}

