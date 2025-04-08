Question:
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 
Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 

Constraints:
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Ans:

class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length<3){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }

        
       int k =3;
       PriorityQueue<Integer> minheap = new PriorityQueue<>();
       for(int i=0 ; i<nums.length ;i++){
           
            if(!minheap.contains(nums[i])){minheap.add(nums[i]);}
            if(minheap.size()>k){
                minheap.poll();
            }
       }

       ArrayList<Integer> list = new ArrayList<>();
       for(int value : minheap){
            list.add(value);
       }
        int i =0 ;
       int[] arr = new int[list.size()];
       for(int a : list){
            arr[i++] = a;
       }

       if(arr.length<3){
            return arr[arr.length-1];
       }else{
            return arr[0];
       }

       
    }
}