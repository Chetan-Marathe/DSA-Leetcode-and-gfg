Add two numbers of the linkedlist:

Code:

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     if(l1==null){
        return l2;
     }else if(l2==null){
        return l1;
     }

     ListNode dummy = new ListNode(-1);
     ListNode ans = dummy;

     int carry = 0;
     while(l1!=null || l2!=null){
        int val1 = l1!=null ? l1.val : 0;
        int val2 = l2!=null ? l2.val : 0;

        int sum = val1+val2+carry;

        int u = sum%10;
        carry = sum/10;

        ListNode curr = new ListNode(u);
        dummy.next=curr;
        dummy=dummy.next;

        l1=l1!=null?l1.next:l1;
        l2=l2!=null?l2.next:l2;
     }

     if(carry>0){
        ListNode curr = new ListNode(carry);
        dummy.next=curr;
        dummy=dummy.next;
     }

     return ans.next;
     
    }
}