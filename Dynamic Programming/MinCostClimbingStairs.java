class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 1; i < cost.length; i++) {
            dp[i + 1] = Math.min(dp[i] + cost[i], dp[i - 1] + cost[i - 1]); 
        }
        return dp[cost.length];
    }
}
