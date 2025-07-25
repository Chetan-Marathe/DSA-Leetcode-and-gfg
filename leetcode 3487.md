3487. Maximum Unique Subarray Sum After Deletion
You are given an integer array nums.

You are allowed to delete any number of elements from nums without making it empty. After performing the deletions, select a subarray of nums such that:

All elements in the subarray are unique.
The sum of the elements in the subarray is maximized.
Return the maximum sum of such a subarray.

Example 1:

Input: nums = [1,2,3,4,5]

Output: 15

Explanation:

Select the entire array without deleting any element to obtain the maximum sum.

Code:
class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        if(nums[nums.length-1]<0){
            return nums[nums.length-1];
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            if(val>0){
                set.add(val);
            }
        }

        List<Integer> list = new ArrayList<>();
        list.addAll(set);

        int ans = 0;
        for(int val1 : list){
            ans+=val1;
        }

        return ans;
    }
}