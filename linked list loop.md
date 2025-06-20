Linked list loop:

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        Node first = head;
        Node second = head;
        while(second.next!=null && second.next.next!=null){
            first=first.next;
            second=second.next.next;
            if(first==second){
                return true;
            }
        }
        
        return false;
        
    }
}