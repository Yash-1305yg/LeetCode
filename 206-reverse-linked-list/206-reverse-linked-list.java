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
    public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode current = head;
//         ListNode temp=null;
//         while(current!=null){
//             temp=current.next;
//             current.next=prev;
//             prev=current;
//             current=temp;
            
//         }
//         return prev;
        if(head==null || head.next==null)return head;
        int len=0;
        ListNode curr=head;
        while(curr.next!=null)
        {
            len++;
            curr=curr.next;
        }
        int right= len;
        int left = 1;
        swap(head , left , right);
        return head;
    }
    
    public ListNode swap(ListNode head, int left , int right)
    {
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
        for(int i=1;i<=right;i++)
        {
            two=two.next;
        }
        
        int temp=one.val;
        one.val=two.val;
        two.val=temp;
        swap(head , left+1,right-1);
        return head;
    }
}