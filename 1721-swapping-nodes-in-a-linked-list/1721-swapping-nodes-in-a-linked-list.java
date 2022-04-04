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
         // 1st method done by myself by converting LL to array and then changing it back to LL
        ListNode curr = head;
        int len=0;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        int arr[] = new int[len];
        int x=0;
        ListNode temp= head;
        while(temp!=null )
        {
            arr[x++] = temp.val;
            temp=temp.next;
        }
        
        int j = arr.length-k;
        int tempo=arr[k-1];
        arr[k-1]=arr[j];
        arr[j]=tempo;
        
        ListNode res= head;
        int z=0;
        while(res!=null )
        {
            res.val=arr[z];
            res=res.next;
            z++;
        }
        return head;
        
        //2nd but faster method
        
//         ListNode A=head ,B=head , nodek ;
        
//         for(int i=1 ; i<k ; i++)
//             A= A.next;
        
//         nodek = A;
//         A=A.next;
        
//         while(A!=null){
//             B=B.next;
//             A=A.next;
//         }
//         int temp= nodek.val;
//         nodek.val =B.val;
//         B.val = temp;
//         return head;
        
    }
}