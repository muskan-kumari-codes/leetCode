class Solution {
    static boolean solve(int[] nums, int i){
        if(i==nums.length-1) return true;
        if(i>=nums.length) return false;
        if(nums[i]==0) return false;

        boolean overAll = false;
        for(int j=1; j<=nums[i]; j++){
            boolean recAns = solve(nums, i+j);
            overAll = overAll || recAns;
        }
        return overAll;
    }
    public boolean canJump(int[] nums) {
        return solve(nums, 0);
    }
}
