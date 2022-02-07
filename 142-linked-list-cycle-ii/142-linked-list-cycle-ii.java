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
    public ListNode detectCycle(ListNode head) {
        ListNode fast= head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            
            fast=fast.next.next;
            if(slow==fast){ //fast and slow dono mein se kisi pe bhi equal ho sakte hain islie slow ko wapas s ehead se chalu karke fast ke equal karana padega
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
            
        }
        return null;
        
    }
}