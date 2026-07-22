class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }

        int dc = 0;

        for (int i = 1; i < nums.length; i++) {
            // 내림차순 발견
            if (nums[i - 1] > nums[i]) {
                dc++;
                // 고칠 곳이 2개 이상이면 false
                if (dc > 1) {
                    return false;
                }
                // 현재 검사 중인 요소 기준 오름차순 조건에 맞으면
                if (i == 1 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } // 아니면
                else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }
}