Question:- 
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Ans:-
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int n = nums.length;
        for(int i=0 ;i<nums.length;i++){
            int element = nums[i];
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else{
                map.put(element,1);
            }
        }
        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key)>n/2){
                ans = key;
                break;
            }
        }
       return ans; 
    }
}

