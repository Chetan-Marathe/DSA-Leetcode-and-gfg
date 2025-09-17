82. Remove Duplicates from Sorted List II
Solved
Medium
Topics
premium lock icon
Companies
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            int val = head.val;
            map.put(val,map.getOrDefault(val,0)+1);
            list.add(val);
            head=head.next;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int value : list){
            if(map.get(value)==1){
                ans.add(value);
            }
        }

        ListNode ptr1 = new ListNode(-1);
        ListNode ptr2 = ptr1;

        for(int value1 : ans){
            ListNode ptr3 = new ListNode(value1);
            ptr1.next=ptr3;
            ptr1=ptr1.next;
        }

        ptr1.next=null;

        return ptr2.next;

        
    }
}