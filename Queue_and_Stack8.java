package student.banasthali.abhilasha.Queue and Stack;


   
import java.io.*;

public class Queue_and_Stack8 {


static String removeDuplicateLetters(String s)
{
	
	
	int[] cnt = new int[26];

	
	int[] vis = new int[26];

	int n = s.length();

	
	for(int i = 0; i < n; i++)
		cnt[s.charAt(i) - 'a']++;


	String res = "";

	for(int i = 0; i < n; i++)
	{
		
		
		cnt[s.charAt(i) - 'a']--;

	
		if (vis[s.charAt(i) - 'a'] == 0)
		{
			
			
			int size = res.length();
			while (size > 0 &&
				res.charAt(size - 1) > s.charAt(i) &&
				cnt[res.charAt(size - 1) - 'a'] > 0)
			{
				
				
				vis[res.charAt(size - 1) - 'a'] = 0;
				res = res.substring(0, size - 1);
				size--;
			}
			
			
			res += s.charAt(i);
			vis[s.charAt(i) - 'a'] = 1;
		}
	}
	
	
	return res;
}


public static void main(String[] args)
{
	
	
	String S = "acbc";

	
	System.out.println(removeDuplicateLetters(S));
}
}


    

