class Solution {
    static boolean solve(int[] nums,int i){
        if(i>=nums.length-2) return false;
       
        int includeSum = nums[i] + nums[i+1];
        i = i+1;
        for(int j = i; j<nums.length-1; j++){
            int excludeSum = nums[j] + nums[j+1];
            if(includeSum == excludeSum) return true;
        }

        return solve(nums, i);
    }
    public boolean findSubarrays(int[] nums) {
       
       int i = 0;
       boolean ans = solve(nums, i);
       return ans;  
    }
} 
