import java.util.*;
public class Problem10 {
    public static int eval(String[] arr)
	{
		
		int i = 0;
		
		int lastNum = -1;
		while (i < arr.length) {
			
			if ("/*+-".contains(arr[i])) {
				
				int val1= Integer.valueOf(arr[lastNum - 1]);
				
				int val2 = Integer.valueOf(arr[lastNum]);
				
				int ans = 0;
				
				if (arr[i].equals("*"))
					ans = val1 * val2;
				else if (arr[i].equals("/"))
					ans = val1 / val2;
				else if (arr[i].equals("+"))
					ans = val1 + val2;
				else if (arr[i].equals("-"))
					ans = val1 - val2;
				
				arr[lastNum - 1] = Integer.toString(ans);
				
				lastNum--;
			}
			
			else {
				
				lastNum++;
				
				arr[lastNum] = arr[i];
			}
			i++; 
		}
		return Integer.valueOf(
			arr[lastNum]); 
	}
    public static void main(String[] args) {
        String[] arr = {"2","1","+","3","*"};
        System.out.println(eval(arr));

    }
}
