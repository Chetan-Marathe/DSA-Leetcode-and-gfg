Code:
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode ptr1 = head;
       ListNode ptr2 = head;
       while(ptr2!=null && ptr2.next!=null){
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
            if(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
                ListNode start = head;
                while(start!=ptr1){
                    start=start.next;
                    ptr1=ptr1.next;
                }
                return start;
            }
        }
       }

       return null;
    }
}