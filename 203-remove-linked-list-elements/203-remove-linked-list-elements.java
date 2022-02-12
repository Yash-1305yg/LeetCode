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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = null;
        ListNode curr= head;
        if(head == null){return null;}
        
        while(curr!=null && curr.val == val){
             
           head= curr.next;
            curr= head;
           
        }
        while(curr != null)
        {
            while(curr!=null && curr.val != val)
            {
                temp = curr;
                curr=curr.next;
            }
            
            if (curr == null)
                return head;
 
            // Unlink the node from linked list
            temp.next = curr.next;
 
            // Update Temp for next iteration of outer loop
            curr = temp.next;
        }
        return head;
    }
}