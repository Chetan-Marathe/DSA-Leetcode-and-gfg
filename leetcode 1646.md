1646. Get Maximum in Generated Array
You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:

nums[0] = 0
nums[1] = 1
nums[2 * i] = nums[i] when 2 <= 2 * i <= n
nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
Return the maximum integer in the array nums​​​.
Code:
class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int[] nums = new int[n+1];
        nums[0]=0;
        nums[1]=1;
        int j=1;
        int k=2;
        for(int i=2;i<nums.length;i+=2){
            nums[i]=nums[j];
            if(i+1<nums.length){
            nums[i+1]=nums[j]+nums[k];
            }
            j++;
            k++;
        }
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}