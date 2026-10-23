class Solution {
    static int solve(int[] coins, int amount){
        if(amount==0) return 0;
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;

        for(int coin : coins){
            int ans_rec = solve(coins, amount-coin);
            if(ans_rec != Integer.MAX_VALUE){
                int finalAns = ans_rec + 1;
                mini = Math.min(finalAns, Integer.MAX_VALUE);
            }
        }
        return mini;
    }
    public int coinChange(int[] coins, int amount) {
        int ans = solve(coins, amount);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
