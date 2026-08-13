class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = getOddSum(n);
        int even = getEvenSum(n);

        return gcd(odd, even);
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getOddSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (i - 1) * 2 + 1;
        }

        return sum;
    }

    public int getEvenSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * 2;
        }

        return sum;
    }
}