class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            //System.out.println("amount가 " + i + "일 때 최소 코인 값:\n");
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    //System.out.print("amount = " + i + " 이 current coin = " + coins[j] + " 이상일 때, dp[" + (i - coins[j]) + "] + 1 = " + (dp[i - coins[j]] + 1) + "과 현재값 " + dp[i] + "와 비교해서 더 작은 ");
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    //System.out.println("dp[" + i + "] = " + dp[i] + "\n");
                }
            }
            //System.out.println("===========================================================================");
        }
        
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}