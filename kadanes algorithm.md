class Solution {
    public int alternatingSubarray(int[] nums) {
        int length = -1;
        for(int i=0 ;i<nums.length-1;i++){
            if((nums[i+1]-nums[i])==1){
                length = Math.max(2,length);
            }
            int m = i;
            int n = i+1;
            for(int j=i+2;j<nums.length;j++){
                if(nums[j]==nums[m] || nums[j]==nums[n]){
                    length++;
                }else{
                    break;
                }
            }
        }

        return length;
        
    }
}