203. Remove Linked List Elements
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Code:
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
    public ListNode removeElements(ListNode head, int val) {
       ListNode ptr1 = new ListNode(-1);
       ListNode ptr2 = ptr1;

       while(head!=null){
            if(head.val==val){
                head=head.next;
            }else{
                ListNode ptr3 = new ListNode(head.val);
                ptr1.next=ptr3;
                ptr1=ptr1.next;
                head=head.next;
            }
       }

       return ptr2.next;
       


    }
}