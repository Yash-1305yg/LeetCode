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
       if(head==null){
           return true;
       }
        ListNode mid = middle(head);
        ListNode last = doreverse(mid);
        ListNode current2=head;
        while(last!=null){
            if(current2.val != last.val){
                return false;
            }
            current2=current2.next;
            last=last.next;
        }
        return true;
        
    }
    
    public ListNode middle(ListNode head){
    ListNode slow= head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    }
    
    public ListNode doreverse(ListNode midd) {
        ListNode temp = null;
            ListNode current = midd;
            ListNode prev = null;
        if(midd != null )
        {
            
            
            while(current != null)
            {
                temp = current.next;
                current.next = prev;
                prev = current ; 
                current = temp;
            }
        }
       return prev;
    }
}

