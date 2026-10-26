class Solution {
    static void solve(int[] nums, List<Integer> ans, int i, List<List<Integer>> list){
        if(i>=nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }

        //include
        ans.add(nums[i]);
        solve(nums, ans, i+1, list);

        ans.remove(ans.size()-1);
        //exclude
        solve(nums, ans, i+1, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        solve(nums, ans, 0, list);
        return list;
    }
}
