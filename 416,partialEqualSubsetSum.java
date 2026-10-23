class Solution {
    static boolean solve(int[] nums, int target, int i){
        if(target == 0) return true;
        if(target < 0) return false;
        if(i>=nums.length) return false;

        boolean include = solve(nums, target-nums[i], i+1);
        boolean exclude = solve(nums, target, i+1);

        return include || exclude;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        
        // odd sum
        if(sum%2 != 0){
            return false;
        }

        int target = sum/2;
        int i = 0;
        return solve(nums, target, i);
    }
}
