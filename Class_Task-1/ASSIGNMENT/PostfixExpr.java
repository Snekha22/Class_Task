package PostfixExpr;

import java.util.Scanner;
import java.util.Stack;
public class PostfixExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the expression: ");
String expression = scanner.nextLine();
scanner.close();
int result = evaluatePostfix(expression);
System.out.println("Result: " + result);
}
	public static int evaluatePostfix(String expression) 
	{
        Stack<Integer> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        for (String token : tokens) 
        {
            if (token.matches("\\d+"))
            {
                stack.push(Integer.parseInt(token));
            } 
            else
            {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (token) 
                {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

	}


