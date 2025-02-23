class Solution {
    private int[][] dp;

    public int getLongestSubsequence(int[] nums, int index, int prevIndex) {
        if (index == nums.length) return 0;
        if (dp[index][prevIndex + 1] != -1) return dp[index][prevIndex + 1];

        int taken = 0;
        if (prevIndex == -1 || nums[index] > nums[prevIndex]) {
            taken = 1 + getLongestSubsequence(nums, index + 1, index);
        }
        int notTaken = getLongestSubsequence(nums, index + 1, prevIndex);

        return dp[index][prevIndex + 1] = Math.max(taken, notTaken);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        return getLongestSubsequence(nums, 0, -1);
    }
}