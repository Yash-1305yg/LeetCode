/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node item=head;
        Node front=head;
        
        while(item!=null){
            front=item.next;
            Node copy=new Node(item.val);
            item.next=copy;
            copy.next=front;
            item=front;
        }
        item=head;
        while(item!=null){
            if(item.random!=null){
                item.next.random=item.random.next;
            }
            item=item.next.next;
        }
        item=head;
        Node temp=new Node(0);
        Node copy=temp;
        
        while(item!=null){
            front=item.next.next;
            copy.next=item.next;
            copy=copy.next;
            item.next=front;
            item=front;
        }
        return temp.next;  
    }
}