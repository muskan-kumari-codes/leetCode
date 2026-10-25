class Solution {
    static int solve(List<List<Integer>> triangle, int i, int j){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }

        int ans1 =solve(triangle, i+1, j);
        int ans2 =solve(triangle, i+1, j+1);
        int finalAns = triangle.get(i).get(j) + Math.min(ans1, ans2);
        return finalAns;
    }
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int i =0;
        int j = 0;
        return solve(triangle, i, j);
    }
}
