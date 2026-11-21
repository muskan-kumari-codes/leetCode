class Solution {
    public int maximumDifference(int[] nums) {
        int curr = nums[0];
        int ans = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i]<curr){
                curr = nums[i];
            }
            if(nums[i]-curr>ans){
                ans = nums[i]-curr;
            }
        }
        return (ans==0)?-1:ans;
    }
}
