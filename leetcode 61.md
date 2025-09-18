61. Rotate List
Given the head of a linked list, rotate the list to the right by k places.

Example 1:
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

Output:

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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        while(k>list.size()){
            k=k-list.size();
        }
        int val=list.size()-k;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int count = 1;
        for(int value : list){
            if(count<=val){
                list1.add(value);
            }else{
                list2.add(value);
            }
            count++;
        }

        list2.addAll(list1);
        ListNode ptr1 = new ListNode(-1);
        ListNode ptr2 = ptr1;
        for(int value1 : list2){
            ListNode ptr3 = new ListNode(value1);
            ptr1.next=ptr3;
            ptr1=ptr1.next;
        }
        return ptr2.next;

    }
}