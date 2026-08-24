/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

          if (head == null || head.next == null) return;

        ListNode slow=head, fast=head;
        ListNode prev=null;
        // ListNode temp=head;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;

        prev=null;

        ListNode temp=slow;
        ListNode nextp=null;

        while(temp!=null){
            nextp=temp.next;
            temp.next=prev;

            prev=temp;
            temp=nextp;

        }

        ListNode dummy= new ListNode(-1);
        ListNode tail=dummy;


        ListNode t1=head;
        ListNode t2=prev;


        int i=1;

        while(t1!=null && t2!=null){

            tail.next=t1;
            tail=tail.next;
            t1=t1.next;

            tail.next=t2;
            tail=tail.next;
            t2=t2.next;


        }   
         if (t1 != null) tail.next = t1;
        if (t2 != null) tail.next = t2;
        head=dummy.next;

    // return head;



          
        }
        
    }
