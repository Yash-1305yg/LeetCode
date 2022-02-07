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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast= head , slow= head , temp =null;
        
        while(fast!= null && fast.next !=null){
            temp = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast == head){
            head=null;
        }
        else{
        temp.next = slow.next;
        slow.next=null;
        }
        return head;
    }
}