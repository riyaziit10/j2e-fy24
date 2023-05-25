import java.io.*;
import java.util.*;

public class LinkedList {
	
	Node head; 
	static class Node {
	
		int data;
		Node next;
	
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public static LinkedList insert(LinkedList list, int data)
	{

		Node new_node = new Node(data);
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
	
			last.next = new_node;
		}
	
		return list;
	}
	
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;
	
		System.out.print("LinkedList: ");
		while (currNode != null) {
			System.out.print(currNode.data + " ");
	
			currNode = currNode.next;
		}
	}

    public static void solve(LinkedList list){
        Node currNode = list.head;
        Node prev = null;
        if(currNode==null)return;
        int ct=1;
        while(currNode!=null){
            if(ct==2){
                int temp=prev.data;
                prev.data=currNode.data;
                currNode.data=temp;
                currNode=currNode.next;
                ct=1;
            }
            else{
                ct++;
                prev=currNode;
                currNode=currNode.next;
            }
        }
        printList(list);
    }

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		LinkedList list = new LinkedList();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            list=insert(list,x);
        }
		printList(list);
        System.out.println();
        solve(list);
	}
}
