3392. Count Subarrays of Length Three With a Condition

Given an integer array nums, return the number of subarrays of length 3 such that the sum of the first and third numbers equals exactly half of the second number.

Code:
class Solution {
    public int countSubarrays(int[] arr) {
        int count = 0;
        int i = 0;
        int j = 2;
        while(j<arr.length){
            if((double)arr[i]+arr[j]==(double)arr[j-1]/2){
                count++;
            }
            i++;
            j++;
        }

       return count;
    }
}