class Solution {
    public int minOperations(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int answer = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] >= nums[i]) {
                while (nums[i] <= nums[i-1]) {
                    nums[i] += 1;
                    answer++;
                }
            }
        }

        return answer;
    }
}