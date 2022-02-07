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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode A=head ,B=head , nodek ;
        
        for(int i=1 ; i<k ; i++)
            A= A.next;
        
        nodek = A;
        A=A.next;
        
        while(A!=null){
            B=B.next;
            A=A.next;
        }
        int temp= nodek.val;
        nodek.val =B.val;
        B.val = temp;
        return head;
        
    }
}