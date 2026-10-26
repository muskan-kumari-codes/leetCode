class Solution {
    static void solve(int[] nums, List<List<Integer>> list, List<Integer> ans, int i){
        if(i==nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        //include
        ans.add(nums[i]);
        solve(nums, list, ans, i+1);
        //exclude
        ans.remove(ans.size()-1);
        int idx = i+1;
        while(idx < nums.length && nums[idx]==nums[i]){
            idx++;
        }
        solve(nums, list, ans, idx);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums, list, ans, 0);
        return list;
    }
}
