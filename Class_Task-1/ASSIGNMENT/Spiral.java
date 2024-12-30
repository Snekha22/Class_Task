package Spiral;
import java.util.Scanner;
public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the matrix: ");
int n = scanner.nextInt();
scanner.close();
int[][] matrix = createSpiralMatrix(n);
printMatrix(matrix);
}
 
	public static int[][] createSpiralMatrix(int n)
	{
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (num <= n * n)
        {
            for (int i = left; i <= right; i++) 
            {
                matrix[top][i] = num++;
            }
            top++;
            for (int i = top; i <= bottom; i++)
            {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--)
                {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) 
                {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
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


