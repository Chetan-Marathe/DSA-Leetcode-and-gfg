162. Find Peak Element
A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(nums.length==1){
            return 0;
        }
       while(start<=end){
            int mid = start + (end-start)/2;
            if(mid==0){
                if(nums[mid]>nums[mid+1]){
                    return mid;
                }
                start=mid+1;
            }else if(mid==nums.length-1){
                if(nums[mid]>nums[mid-1]){
                   return mid;
                }
                end=mid-1;
            }
            else if(mid != 0) {
                if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                    return mid;
                } else if (nums[mid] > nums[mid - 1] && nums[mid] < nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return 1;
    }
}