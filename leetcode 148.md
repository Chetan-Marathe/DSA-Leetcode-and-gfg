148. Sort List
Solved
Medium
Companies
Given the head of a linked list, return the list after sorting it in ascending order.

Code:

class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        Collections.sort(list);
        ListNode ptr = new ListNode(-1);
        ListNode curr = ptr;
        for(int val : list){
            ListNode curr1 = new ListNode(val);
            ptr.next=curr1;
            ptr=ptr.next;
        }
        return curr.next;
    }
}