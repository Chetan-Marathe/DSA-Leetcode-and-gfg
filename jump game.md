class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }else if(nums.length>1){
            if(nums[0]==0){
                return false;
            }
        }
        int goal = nums.length-1;
        for(int i=nums.length-2 ;i>=0;i--){
            if(i+nums[i]>=goal){
                goal=i;
            }
        }
        return goal==0;
        
    }
}