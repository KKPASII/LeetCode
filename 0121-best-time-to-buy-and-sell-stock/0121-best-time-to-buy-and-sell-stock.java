class Solution {
    public int maxProfit(int[] prices) {
        // 그리디, dp
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        int size = prices.length;
        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
                continue;
            }
            maxPrice = Math.max(maxPrice, price - minPrice);
        }
        return maxPrice;
    }
}