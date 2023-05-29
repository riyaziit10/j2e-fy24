package student.banasthali.abhilasha.recursion;


   
import java.util.*;
import java.io.*;

public class recursion5 {
	
	public static class Node {
		int data;
		Node left;
		Node right;
		Node(int data, Node left, Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	
	public static void display(Node node, List<Integer> al)
	{
		
		if (node == null) {
			return;
		}
	
		if (node.left != null) {
			al.add(node.left.data);
		}

		else {
			al.add(null);
		}
		
	
		if (node.right != null) {
			al.add(node.right.data);
		}
	
		else {
			al.add(null);
		}
	
		
		display(node.left, al);
		display(node.right, al);
	}

	public static void main(String[] args)
	{

		int n = 7;
		

		List<Node> list = allPossibleFBT(n);
	

		for (Node root: list) {
			List<Integer> al = new ArrayList<>();
			al.add(root.data);
			display(root, al);
			System.out.println(al);
		}
	}

	static HashMap<Integer, List<Node> > hm = new HashMap<>();
	public static List<Node> allPossibleFBT(int n)
	{
	
		if (!hm.containsKey(n)) {
			
			
			List<Node> list = new LinkedList<>();
		
			
			if (n == 1) {
			
				list.add(new Node(0, null, null));
			}
		
			
			else if (n % 2 == 1) {
			
				
				for (int x = 0; x < n; x++) {
				
				
					int y = n - 1 - x;
				
				
					for (Node left: allPossibleFBT(x)) {
					
				
						for (Node right: allPossibleFBT(y)) {
						
					
							Node node = new Node(0, null, null);
						
						
							node.left = left;
						
							node.right = right;
						
					
							list.add(node);
						}
					}
				}
			}
		
		
			hm.put(n, list);
		}
		return hm.get(n);
	
}

    
}
