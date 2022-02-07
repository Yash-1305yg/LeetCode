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
    public int getDecimalValue(ListNode head) {
        // String str = new String();
        int str=0;
        ListNode curr = head;
        while(curr!=null){
            str =(str << 1)  + curr.val;
            curr= curr.next;
        }
        // int i = Integer.parseInt(str ,2);
        // return i;
        return str;
    }
}