class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0;
        int buy = prices[0];
        for (int sell = 1; sell < prices.size(); sell++) {
            if (prices[sell] > buy)
                profit = max(profit, prices[sell] - buy);
            else
                buy = prices[sell];
        }

        return profit;
    }
};