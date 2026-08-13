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
    public ListNode partition(ListNode head, int x) {
        

        // ArrayList<Type> Smaller = new ArrayList<>();  
        // ArrayList<Type> larger = new ArrayList<>();  


        // ListNode temp=head;

        // while(temp!=null){

        // }  


        ListNode dummyless=new ListNode(-1);
        ListNode dummygret=new ListNode(-1);
        ListNode tl=dummyless;
        ListNode tg=dummygret;
        ListNode temp=head;


        while(temp!=null){
            if(temp.val<x){
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