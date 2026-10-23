class Solution {
    static int solve(int amount, int[] coins, int i){
        if(amount==0) return 1;
        if(i>=coins.length) return 0;
        if(amount<0) return 0;

        int include = solve(amount-coins[i], coins, i);
        int exclude = solve(amount, coins, i+1);
        return include + exclude;
    }
    public int change(int amount, int[] coins) {
        int i = 0;
        int ans = solve(amount, coins, i);
        return ans;
    }
}
