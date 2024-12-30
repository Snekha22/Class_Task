package Nqueen;
import java.util.Scanner;
public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of N: ");
int n = scanner.nextInt();
scanner.close();
solveNQueens(n);
}
	public static void solveNQueens(int n)
	{
		char[][] board = new char[n][n];
		
	        for (int i = 0; i < n; i++)
	        {
	            for (int j = 0; j < n; j++)
	            {
	                board[i][j] = '.';
	            }
	        }

	        if (solveNQueensHelper(board, 0)) 
	        {
	            System.out.println("Solution:");
	            printBoard(board);
	        } 
	        else 
	        {
	            System.out.println("No solution exists.");
	        }
	    }
	
    public static boolean solveNQueensHelper(char[][] board, int row) 
    {
	        if (row == board.length) 
	        {
	            return true;
	        }

	        for (int col = 0; col < board.length; col++) 
	        {
	            if (isValidMove(board, row, col)) 
	            {
	                board[row][col] = 'Q';
	                if (solveNQueensHelper(board, row + 1))
	                {
	                    return true;
	                }
	                board[row][col] = '.';
	            }
	        }

	        return false;
	    }
    public static boolean isValidMove(char[][] board, int row, int col) 
    {
    	for (int i = 0; i < row; i++)
    	{
	        if (board[i][col] == 'Q') 
	        {
	           return false;
	            }
	        }
    	for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
    	{
    		if (board[i][j] == 'Q') 
	            {
	                return false;
	            }
	        }
    	for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) 
    	{
    		if (board[i][j] == 'Q') 
    		{
	                return false;
	            }
	        }
    	return true;
	    }
    public static void printBoard(char[][] board) 
    {
    	for (int i = 0; i < board.length; i++) 
    	{
    		for (int j = 0; j < board.length; j++) 
    		{
    			System.out.print(board[i][j] + " ");
	            }
   System.out.println();
	        }
	    }
	
	}


