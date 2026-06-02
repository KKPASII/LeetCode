class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1_000_000_007;
        
        int answer = 0;
        int[] subarr = new int[n * (n + 1) / 2];

        int idx = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarr[idx++] = sum;
            }
        }

        Arrays.sort(subarr);
        for (int i = left - 1; i < right; i++) {
            answer = (answer + subarr[i]) % mod;
        }

        return answer;
    }
}