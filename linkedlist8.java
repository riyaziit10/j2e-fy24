package student.banasthali.abhilasha.linkedlist;


    
import java.util.*;

public class linkedlist8 {

static class Node {
	int data;
	Node next;
};

	
static Node append(Node head_ref, int new_data)
{
	
	Node new_node = new Node();

	Node last = head_ref; 


	new_node.data = new_data;

	
	new_node.next = null;


	if (head_ref == null) {
		head_ref = new_node;
		return head_ref;
	}

	
	while (last.next != null) {
		last = last.next;
	}

	
	last.next = new_node;
	return head_ref;
}

	
static Node mergeInBetween(Node list1, Node list2,
					int a, int b)
{

	int cnt = 0;

	
	Node list = list1;

	while (cnt + 1 != a) {
		
		list = list.next;
		
		cnt++;
	}
	
	
	Node demo = list.next;

	list.next = list2;
	
	Node samp = list2;
	
	while (samp.next != null)
		samp = samp.next;
	
	while (cnt + 1 != b) {
		demo = demo.next;
		cnt++;
	}
	
	demo = demo.next;
	samp.next = demo;
	return list1;
}

	
static void printList(Node node)
{
	while (node != null) {
		System.out.print(" " + node.data);
		node = node.next;
	}
}

	
public static void main(String[] args)
{
	Node list1 = null, list2 = null;
	list1= append(list1, 10);
	list1 = append(list1, 11);
	list1= append(list1, 12);
	list1 = append(list1, 13);
	list1 =append(list1, 14);
	list1 = append(list1, 15);
	list2 = append(list2, 100);
	list2 = append(list2, 101);
	list2 = append(list2, 102);
	list2 =append(list2, 103);
	int a = 3, b = 4;
	list1 = mergeInBetween(list1, list2, a, b);
	printList(list1);
}
}



    

