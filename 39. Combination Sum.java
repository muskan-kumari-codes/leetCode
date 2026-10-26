class Solution {
    static void solve(int[] candidates, int target, List<List<Integer>> list, List<Integer> ans, int i){
        if(target==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        if(target<0) return;
        if(i>=candidates.length) return;
        //include
        ans.add(candidates[i]);
        solve(candidates, target-candidates[i], list, ans, i);

        //backtracking
        ans.remove(ans.size()-1);

        //exclude
        solve(candidates, target, list, ans, i+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        solve(candidates, target, list, ans, 0);
        return list;
    }
}
