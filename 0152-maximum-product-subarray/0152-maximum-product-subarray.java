class Solution {
    public int maxProduct(int[] nums) {
        int minp = nums[0];
        int maxp = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int currentMinp = Math.min(num, Math.min(minp*num, maxp*num));
            int currentMaxp = Math.max(num, Math.max(minp*num, maxp*num));

            minp = currentMinp;
            maxp = currentMaxp;

            answer = Math.max(answer, maxp);
        }

        return answer;
    }
}