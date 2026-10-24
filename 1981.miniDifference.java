class Solution {
    static int solve(int target, int[][] mat, int sum, int row){
        if(row>=mat.length){
            return Math.abs(target - sum);
        }

        int mini = Integer.MAX_VALUE;

        for(int num : mat[row]){
            int ans = solve(target, mat, sum+num, row+1);
            mini = Math.min(mini, ans);
        }
        return mini;
    }
    public int minimizeTheDifference(int[][] mat, int target) {
        int sum = 0 ;
        int row = 0;
        return solve(target, mat, sum, row);
    }
}
