class Solution {
    public int numTimesAllBlue(int[] flips) {
        int answer = 0;
        int len = flips.length;
        int maxIndex = 0;

        char[] num = new char[len];
        Arrays.fill(num,'0');

        for (int i = 0; i < len; i++) {
            int index = flips[i] - 1;
            num[index] = '1';

            maxIndex = Math.max(maxIndex, index);
            if (sorted(num, maxIndex, len)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean sorted(char[] num, int index, int len) {
        for (int i = 0; i <= index; i++) {
            if (num[i] != '1') return false;
        }
        return true;
    }
}