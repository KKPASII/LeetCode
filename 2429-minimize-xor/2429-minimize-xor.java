class Solution {
    public int minimizeXor(int num1, int num2) {
        int oneBitCount = 0;
        while (num2 > 0) {
            oneBitCount += (num2 & 1);
            num2 >>= 1;
        }

        int answer = 0;
        for (int i = 31; i >= 0 && oneBitCount > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                answer |= (1 << i);
                oneBitCount--;
            }
        }

        for (int i = 0; i < 32 && oneBitCount > 0; i++) {
            if ((answer & (1 << i)) == 0) {
                answer |= (1 << i);
                oneBitCount--;
            }
        }

        return answer;
    }
}