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
    public boolean isPalindrome(ListNode head) {
        
        
        // Brute force appraoch 

        // ArrayList<Integer> ans= new ArrayList<>();


        // ListNode temp=head;

        // while(temp!=null){
            
        //     ans.add(temp.val);
        //     temp=temp.next;
        // }


        // //two pointer

        // int left=0;
        // int right=ans.size() -1;

        // while(left<right){
        //     if(!ans.get(left).equals(ans.get(right))){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }

        // return true;

        // Optimal using reverse 


        // finding a middle node of that 



        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        
        if(head.next==null){
            return true;
        }

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;

            // if(slow==fast){

            // }
        }

        prev.next=null;

        // reveresr the linked list

        ListNode curr=slow;

        ListNode nextp;

        prev=null;

        while(curr!=null){

            nextp=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nextp;

        }



        //traversal of the linked list 

        ListNode temp1=head;
        ListNode temp2=prev;
    

        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return true;











    }
}