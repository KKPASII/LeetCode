class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int[] digits = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> seq = new ArrayList<>();
        int lowDigitNumber = getDigitNumber(low);
        int highDigitNumber = getDigitNumber(high);

        for (int len = lowDigitNumber; len <= highDigitNumber; len++) {
            for (int i = 0; i <= digits.length - len; i++) {
                int num = 0;

                for (int j = i; j < i + len; j++) {
                    num = num * 10 + digits[j];
                }

                if (low <= num && num <= high) {
                    seq.add(num);
                }
            }
        }

        return seq;
    }

    public int getDigitNumber(int num) {
        int cnt = 0;
        while (num > 0) {
            num /= 10;
            cnt++;
        }
        return cnt;
    }
}