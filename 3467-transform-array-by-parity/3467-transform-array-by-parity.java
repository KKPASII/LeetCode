class Solution {
    public int[] transformArray(int[] nums) {
        int[] evenodd = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            evenodd[i] = nums[i]%2;
        }
        Arrays.sort(evenodd);
        return evenodd;
    }
}