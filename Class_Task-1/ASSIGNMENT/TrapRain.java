package TrapRain;

import java.util.*;
import java.util.Scanner;
public class TrapRain {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of heights: ");
int n = scanner.nextInt();
int[] heights = new int[n];

System.out.println("Enter the heights:");
for (int i = 0; i < n; i++) 
{
	heights[i] = scanner.nextInt();
	}
scanner.close();
int trappedWater = calculateTrappedWater(heights);
System.out.println("Water trapped: " + trappedWater + " units");
}

public static int calculateTrappedWater(int[] heights) {
	int n = heights.length;
	int[] leftMax = new int[n];
	int[] rightMax = new int[n];
	int trappedWater = 0;
	leftMax[0] = heights[0];
	for (int i = 1; i <n; i++) {
		leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
		}

	rightMax[n - 1] = heights[n - 1];
	for (int i = n - 2; i >= 0; i--) {
		rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
		}
	for (int i = 0; i < n; i++) 
	{
		trappedWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
	        }
	return trappedWater;
	    }
	}


