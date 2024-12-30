package UniquePaths;
import java.util.Scanner;
public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter grid size (rows x columns): ");
int m = scanner.nextInt();
int n = scanner.nextInt();
scanner.close();
int uniquePaths = calculateUniquePaths(m, n);

System.out.println("Unique paths: " + uniquePaths);
}
	
	public static int calculateUniquePaths(int m, int n)
	{
		int[][] dp = new int[m][n];
		for (int i = 0; i < m; i++) 
		{
	            dp[i][0] = 1;
	          }
	        for (int j = 0; j < n; j++)
	        {
	            dp[0][j] = 1;
	        }
	        for (int i = 1; i < m; i++) 
	        {
	            for (int j = 1; j < n; j++)
	            {
	                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
	            }
	        }

	        return dp[m - 1][n - 1];
	    }
	}


