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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int length=1;
        ListNode curr=head;
        ListNode temp = head;
        while(curr.next!=null)
        {
            length++;
            curr=curr.next;
        }
        //k can be larger than the given size of linked list
        for(int i=length-k%length;i>1;i--)
        {
            temp=temp.next;
        }
        
        curr.next=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
    
}