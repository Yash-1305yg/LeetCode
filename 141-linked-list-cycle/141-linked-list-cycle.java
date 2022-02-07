/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode curr= head;
        
        while(curr!=null && curr.next!=null){
            curr= curr.next.next;
            temp = temp.next;
            if(curr==temp){
                return true;
            }
        }
        return false;
    }
}