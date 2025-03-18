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