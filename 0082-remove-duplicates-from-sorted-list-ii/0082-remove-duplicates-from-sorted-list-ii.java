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
    public ListNode deleteDuplicates(ListNode head) {
        
        HashMap <Integer, Integer> ans=new HashMap<>();

        ListNode temp=head;

        while(temp!=null){
            ans.put(temp.val, ans.getOrDefault(temp.val, 0) +1);
            temp=temp.next;
        }


        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;

        temp=head;

        while(temp!=null){
            if(ans.get(temp.val)==1){
                tail.next=new ListNode(temp.val);
                tail=tail.next;
            }
            temp=temp.next;
        }


        return dummy.next;







        // ListNode t1=head;
        // ListNode t2=head.next;

        // while(t2!=null){
        //     if(t1.val==t2.val){
        //         t1.next=t2.next;

        //         t2=t2.next;
        //     }
        //     else{   
        //         t1=t2;

        //         t2=t2.next;
        //     }
        // }
        // return head;
    }
}