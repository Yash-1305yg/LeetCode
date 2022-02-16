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
public class Solution {
  public ListNode swapPairs(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode newHead = head.next, a=head,b=a.next,pre = null;
    while(a!=null && b!=null){
      a.next = b.next;
      b.next = a;
      if(pre!=null) pre.next = b;
      if(a.next==null) break;
      b = a.next.next;
      pre = a;
      a = a.next;
    }
    return newHead;
  }
}