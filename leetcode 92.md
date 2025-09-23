92. Reverse Linked List II
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] arr = new int[list.size()];
        int i =0 ;
        for(int val : list){
            arr[i]=val;
            i++;
        }
        left--;
        right--;
        while(left<=right){
            swap(arr,left,right);
            left++;
            right--;
        }

        ListNode ptr1 = new ListNode(-1);
        ListNode ptr2 = ptr1;

        for(int value : arr){
            ListNode ptr3 = new ListNode(value);
            ptr1.next=ptr3;
            ptr1=ptr1.next;
        }
        ptr1.next=null;

        return ptr2.next;
    }

    public void swap(int[] arr, int left , int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}