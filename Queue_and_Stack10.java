package student.banasthali.abhilasha.Queue and Stack;


    
import java.io.*;
import java.util.*;

public class Queue_and_Stack10 {
	public int stacky(String[] tokens)
	{

		
		Stack<String> stack = new Stack<String>();
		int x, y;
		String result = "";
		int get = 0;
		String choice;
		int value = 0;
		String p = "";

		
		for (int i = 0; i < tokens.length; i++) {

			
			if (tokens[i] != "+" && tokens[i] != "-"
				&& tokens[i] != "*" && tokens[i] != "/") {
				stack.push(tokens[i]);
				continue;
			}
			else {
			
				choice = tokens[i];
			}

			
			switch (choice) {
			case "+":

				
				x = Integer.parseInt(stack.pop());
				y = Integer.parseInt(stack.pop());
				value = x + y;
				result = p + value;
				stack.push(result);
				break;

			case "-":

				
				x = Integer.parseInt(stack.pop());
				y = Integer.parseInt(stack.pop());
				value = y - x;
				result = p + value;
				stack.push(result);
				break;

			case "*":

				

				x = Integer.parseInt(stack.pop());
				y = Integer.parseInt(stack.pop());
				value = x * y;
				result = p + value;
				stack.push(result);
				break;

			case "/":

				x = Integer.parseInt(stack.pop());
				y = Integer.parseInt(stack.pop());
				value = y / x;
				result = p + value;
				stack.push(result);
				break;

			default:
				continue;
			}
		}

		
		return Integer.parseInt(stack.pop());
	}
}

class GFG {

	public static void main(String[] args)
	{
		
		String[] s
			= { "10", "6", "9", "3", "+", "-11", "*",
				"/", "*", "17", "+", "5", "+" };

		solution str = new solution();
		int result = str.stacky(s);
		System.out.println(result);
	
}

    
}
