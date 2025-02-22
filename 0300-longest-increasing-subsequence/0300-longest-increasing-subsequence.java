class Solution {
    int answer = 0;

    public void getLongestSubsequence(int[] nums, int index, int prev, int count) {
        if (index == nums.length) {
            answer = Math.max(answer, count);
            return;
        }

        if (prev == -1 || nums[index] > nums[prev]) {
            getLongestSubsequence(nums, index + 1, index, count + 1);
        }

        getLongestSubsequence(nums, index + 1, prev, count);
    }

    public int lengthOfLIS(int[] nums) {
        getLongestSubsequence(nums, 0, -1, 0);
        return answer;
    }
}