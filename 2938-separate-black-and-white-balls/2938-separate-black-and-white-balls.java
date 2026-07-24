class Solution {
    public long minimumSteps(String s) {
        long cnt = 0;
        int one = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
            else {
                cnt += one;
            }
        }

        return cnt;
    }
}