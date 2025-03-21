// Leetcode 169
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map =new HashMap<>();
//         int n = nums.length;
//         for(int i=0 ;i<nums.length;i++){
//             int element = nums[i];
//             if(map.containsKey(element)){
//                 map.put(element,map.get(element)+1);
//             }else{
//                 map.put(element,1);
//             }
//         }
//         int ans = 0;
//         for(int key : map.keySet()){
//             if(map.get(key)>n/2){
//                 ans = key;
//                 break;
//             }
//         }
//        return ans; 
//     }
// }

//Leetcode 219
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0 ; i<nums.length ;i++){
//             if(set.contains(nums[i])){
//                 return true;
//             }
//             set.add(nums[i]);
//             if(set.size()>k){
//                 set.remove(nums[i-k]);
//             }
//         }

//         return false;
//     }
// }

//leetcode 1290
// class Solution {
//     public int getDecimalValue(ListNode head) {
//         int result = 0;
//         ListNode ptr = head;
//         while (ptr != null) {
//             result = result * 2 + ptr.val;  
//             ptr = ptr.next;
//         }
//         return result;

//     }
// }

// //Leetcode 160
// public class Solution {
//     public int size(ListNode head){
//          int count = 0;
//          ListNode ptr = head;
//          while(ptr!=null){
//             count++;
//             ptr=ptr.next;
//          }
//          return count;
//        }
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null || headB==null){
//         return null;
//        }

//       int size1 = size(headA);
//       int size2 = size(headB);
//       int size = size1-size2;
//       ListNode ptr1 = headA;
//       ListNode ptr2 = headB;

//       if(size>0){
//         while(size>0){
//            ptr1=ptr1.next;
//            size--;
//         }
//       }else if(size<0){
//         while(size<0){
//            ptr2=ptr2.next;
//            size++;
//         }
//       } 
//       while(ptr1!=ptr2){
//         ptr1=ptr1.next;
//         ptr2=ptr2.next;
//       }

//       return ptr1;
        
//     }
// }