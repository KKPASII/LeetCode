class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int size = nums.length - k + 1;

        int[] answer = new int[size];
        int[] freq = new int[101];

        for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }
        
        for (int i = 0; i < size; i++) {
            answer[i] = findBeauty(freq, x);

            if (i+k < nums.length) {
                int left = nums[i];
                int right = nums[i+k];

                freq[left+50]--;
                freq[right+50]++;
            }
        }

        return answer;
    }

    public int findBeauty(int[] freq, int x) {
        int cnt = 0;

        for (int i = -50; i < 0; i++) {
            cnt += freq[i+50];

            if (cnt >= x) {
                return i;
            }
        }

        return 0;
    }
}