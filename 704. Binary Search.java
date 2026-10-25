class Solution {
    static int search(int[] nums, int target, int s, int e){
        if(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) {
                return search(nums, target, s, mid-1);
            }else{
                return search(nums, target, mid+1, e);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int ans = search(nums, target, 0, nums.length-1);
        return ans;
    }
}
