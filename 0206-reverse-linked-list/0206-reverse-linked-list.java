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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr=head, prev=null, nextp;

        // if(head==null){
        //     return null;
        // }

        while(curr!=null){

            nextp=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nextp;

        }

        return prev;
    }
}