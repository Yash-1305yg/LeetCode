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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left>right)
        {
            return head; 
        }
        ListNode one = head;
        ListNode two = head;
        for(int i=1;i<left;i++)
        {
            one=one.next;
        }
        for(int i=1;i<right;i++)
        {
            two=two.next;
        }
        
        int temp=one.val;
        one.val=two.val;
        two.val=temp;
        reverseBetween(head , left+1,right-1);
        return head;
    }
}