/*
Problem 8:

You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
The blue edges and nodes in the following figure indicate the result:
Build the result list and return its head.


Example 1:
Input: list1 = [0,1,2,3,4,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [0,1,2,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place.


Example 2:
Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,100000
Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
Explanation: The blue edges and nodes in the above figure indicate the result.


Constraints:
● 3 <= list1.length <= 104
● 1 <= a <= b < list1.length - 1
● 1 <= list2.length <= 104

*/



import java.util.*;
public class Problem8 {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Problem8 insert(Problem8 list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public static void printList(Problem8 list) {
        Node currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void mergeInBetween(Problem8 list1, int a, int b, Problem8 list2) {
        if (list1 == null) {
            printList(list2);
            return;
        }
        Node temp = list1.head;
        Node p = null;
        int count = 0;
        while (count < a) {
            p = temp;
            temp = temp.next;
            count++;
        }
        if (a == 0) {
            while (count <= b) {
                temp = temp.next;
                count++;
            }
            Node t = list2.head;
            while (t.next != null) t = t.next;
            t.next = temp;
            list1.head = list2.head;
            printList(list1);
            return;
        }
        Node d = p;
        Node t = list2.head;
        while (t.next != null) t = t.next;
        d.next = list2.head;
        while (count < b) {
            temp = temp.next;
            count++;
        }
        t.next = temp.next;
        printList(list1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem8 list = new Problem8();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list = insert(list, x);
        }
        System.out.println();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        Problem8 list1 = new Problem8();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            list1 = insert(list1, x);
        }
        mergeInBetween(list, a, b, list1);
        sc.close();
    }
}
