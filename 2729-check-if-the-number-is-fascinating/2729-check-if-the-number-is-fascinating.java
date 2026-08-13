class Solution {
    public boolean isFascinating(int n) {
        String sn = Integer.toString(n) + (2 * n) + (3 * n);
        int len = sn.length();
        if (len != 9) {
            return false;
        }

        boolean[] digits = new boolean[10];
        for (int i = 0; i < len; i++) {
            int digit = sn.charAt(i) - '0';
            if (digit == 0 || digits[digit]) {
                return false;
            }

            digits[digit] = true;
        }

        return true;
    }
}