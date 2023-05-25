import java.util.*;
class L2{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int val){
            data=val;
            next=null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(0);
        ListNode a=temp;
        while(list1!=null || list2!=null){
             if(list1==null){
                 temp.next=list2;
                 break;
             }
            if(list2==null){
                temp.next=list1;
                break;
            }
            if(list1.data<=list2.data){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        return a.next;
    }
}