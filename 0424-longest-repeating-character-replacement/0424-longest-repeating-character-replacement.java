class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            while ((right - left + 1) - getMaxFrequency(count) > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            int windowLength = right - left + 1;
            answer = Math.max(answer, windowLength);
        }

        return answer;
    }

    private int getMaxFrequency(int[] count) {
        int maxFreq = 0;

        for (int freq : count) {
            maxFreq = Math.max(maxFreq, freq);
        }

        return maxFreq;
    }
}