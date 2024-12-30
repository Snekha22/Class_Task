package RevWord;

public class RevWord {

public static void main(String[] args) 
	{
		String input = "Hello World";
		
		String s[] = input.split(" ");
		
		String res = "";
		
		for (int i = s.length - 1; i >= 0; i--)
		{
			res += s[i] + " ";
			}
System.out.println(res.substring(0, res.length() - 1));
}
			
}


