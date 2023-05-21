package student.banasthali.abhilasha.linkedlist;

public class linkedlist1 {
        int data;
        Node next;
        
        Node(int value)
        {
            this.data = value;
            this.next = null;
        }
        }
        
        class Main {
        static int length(Node head)
        {
            Node temp = head;
            int count = 0;
            while (temp != null) {
            count++;
            temp = temp.next;
            }
            return count;
        }
        
        static void printList(Node head)
        {
            Node ptr = head;
            while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
            }
            System.out.println();
        }
        
        static Node deleteNthNodeFromEnd(Node head, int n)
        {
            int Length = length(head);
            int nodeFromBeginning = Length - n + 1;
            Node prev = null;
            Node temp = head;
            for (int i = 1; i < nodeFromBeginning; i++) {
            prev = temp;
            temp = temp.next;
            }
            if (prev == null) {
            head = head.next;
            return head;
            }
            else {
            prev.next = prev.next.next;
            return head;
            }
        }
        
        public static void main(String[] args)
        {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            System.out.println("Linked List before Deletion:");
            printList(head);
        
            head = deleteNthNodeFromEnd(head, 4);
        
            System.out.println("Linked List after Deletion:");
            printList(head);
        }
        }
        
        
        
    
