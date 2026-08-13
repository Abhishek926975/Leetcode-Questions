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
    public ListNode oddEvenList(ListNode head) {
        

       
        ListNode dummyless=new ListNode(-1);
        ListNode dummygret=new ListNode(-1);
        ListNode tl=dummyless;
        ListNode tg=dummygret;
        ListNode temp=head;


         int count=0;
        while(temp!=null){
            count++;
            if(count%2!=0){
                tl.next=temp;
                tl=tl.next;
            }
            else{
                tg.next=temp;
                tg=tg.next;
            }
            temp=temp.next;
        }

        tl.next=dummygret.next;
        tg.next=null;
        head=dummyless.next;


        return dummyless.next;
    }
}