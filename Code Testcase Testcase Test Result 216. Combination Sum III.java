class Solution {
    static void solve(int[] nums, int k, int n, int i, List<List<Integer>> list, List<Integer> ans, int count){
        if(count>k) return;
        if(count==k && n==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(n<0) return;
        if(i>=nums.length) return;

        ans.add(nums[i]);
        solve(nums, k, n-nums[i], i+1, list, ans, count+1);

        ans.remove(ans.size()-1);
        solve(nums, k, n, i+1, list, ans, count);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(nums, k, n, 0, list, ans, 0);
        return list;
    }
}
