229. Majority Element II
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:
Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]

Code:

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ;i++){
            int element = nums[i];
            if(map.containsKey(element)){
                map.put(element,map.get(element)+1);
            }else{
                map.put(element,1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                list.add(key);
            }
        }
        return list;
    }
}