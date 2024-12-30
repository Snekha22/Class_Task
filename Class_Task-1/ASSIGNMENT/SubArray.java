package SubArray;


import java.util.Arrays;

public class SubArray {

		static int SubarraySum(int[] arr)
		{
			int res = arr[0];
			int maxEnding = arr[0];
		        for (int i = 1; i < arr.length; i++) 
		        {
		        	maxEnding = Math.max(maxEnding + arr[i], arr[i]);
		          
		        	res = Math.max(res, maxEnding);
		        }
		        return res;
		}	        
public static void main(String[] args) 
{
	int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	System.out.println ("Max Sum :" + SubarraySum(arr));
	}

}


