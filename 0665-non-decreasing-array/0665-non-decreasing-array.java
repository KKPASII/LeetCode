class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        int dc = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                dc++;

                if (dc > 1) {
                    return false;
                }

                if (i == 1 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                }
                else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }
}