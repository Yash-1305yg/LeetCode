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
        if(head == null)
            return head;
        
        ListNode temp = head;
		ListNode curr = head.next;
        ListNode res = curr; 
        while(curr != null && curr.next !=null)
        {
            temp.next = temp.next.next;
            curr.next = curr.next.next;
            temp = temp.next;
            curr = curr.next;
        }
        
        temp.next = res;
        return head;
	
    }
}