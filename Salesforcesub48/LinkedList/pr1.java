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

    public static void solve(LinkedList list,int k){
        Node currNode = list.head;
        if(currNode==null)return;
        int ct=0;
        while(currNode!=null){
            ct++;
            currNode=currNode.next;
        }
        Node prev = null;
        currNode = list.head;
        int x=ct-k;
        boolean flag=true;
        int xt=0;
        while(flag){
            if(x==xt){
                flag=false;
                prev.next=currNode.next;
                currNode.next=null;
                System.out.println(currNode.data+" is the removed element");
            }
            else{
                xt++;
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
        int k=sc.nextInt();
        solve(list,k);
	}
}
