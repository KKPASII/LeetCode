class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean check = true;
            int left = i - k;
            int right = i + k;
            
            if (left >= 0 && nums[i] <= nums[left]) {
                check = false;
            }

            if (right < nums.length && nums[i] <= nums[right]) {
                check = false;
            }

            if (check) {
                answer += nums[i];
            }
        }
        return answer;
    }
}