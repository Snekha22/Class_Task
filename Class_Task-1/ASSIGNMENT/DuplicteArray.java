package Dup_array;


import java.util.ArrayList;
import java.util.List;
public class DuplicteArray
{
	public static void main(String[] args)
	{      
		int [] arr = new int [] {1, 2, 3, 2, 4, 3};   
		System.out.println("Duplicate : ");   
	        
		for(int i = 0; i < arr.length; i++) 
	    
		{  
	    
			for(int j = i + 1; j < arr.length; j++)
	        
			{  
	        
				if(arr[i] == arr[j])  
					System.out.println(arr[j]);  
	            }  
	        }  
	        }
}
