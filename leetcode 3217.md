You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.

Example 1:
Input: nums = [1,2,3], head = [1,2,3,4,5]
Output: [4,5]

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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }

        ListNode ptr1 = new ListNode(-1);
        ListNode ptr2 = ptr1;

        while(head!=null){
            if(set.contains(head.val)==false){
                ListNode ptr3 = new ListNode(head.val);
                ptr1.next=ptr3;
                ptr1=ptr1.next;
            }
            head=head.next;
        }

        return ptr2.next;
    }
}

