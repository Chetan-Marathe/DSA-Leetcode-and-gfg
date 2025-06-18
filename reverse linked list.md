reversing a linked list using three pointers:

class Solution {
    Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node curr1 = curr.next;
            curr.next=prev;
            prev=curr;
            curr=curr1;
        }
        
        return prev;
        
    }
}