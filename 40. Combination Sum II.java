class Solution {
    static void solve(int[] candidates, int target, int i, List<List<Integer>> list, List<Integer> ans){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(i>=candidates.length) return;
        if(target<0) return;

        ans.add(candidates[i]);
        solve(candidates, target-candidates[i], i+1, list, ans);

        ans.remove(ans.size()-1);
        int idx = i+1;
        while(idx<candidates.length && candidates[idx]==candidates[i]){
            idx++;
        }
        solve(candidates, target, idx, list, ans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(candidates);
        solve(candidates, target, 0, list, ans);

        return list;
    }
}
