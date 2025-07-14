class Solution {
    long DecimalValue(Node head) {
        int mod = 1000000007;
        Node ptr = head;
        long result = 0L;
        while(ptr!=null){
            result = (result*2)%mod + ptr.data;
            ptr=ptr.next;
        }
        
        return result;
    }
}