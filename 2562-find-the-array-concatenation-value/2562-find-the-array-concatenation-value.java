class Solution {
    public long findTheArrayConcVal(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int repeat = nums.length/2;
        long sum = 0;

        for (int i = 0; i < repeat; i++) {
            String first = String.valueOf(nums[i]);
            String last = String.valueOf(nums[nums.length - 1 - i]);
            StringBuilder sb = new StringBuilder(first + last);
            int concatNum = Integer.parseInt(sb.toString());

            sum += concatNum;
        }

        if (nums.length % 2 == 1) {
            sum += nums[repeat];
        }

        return sum;
    }
}