class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int len = nums.size();
        if (len == 0) return 0;

        int maximum = nums[0], minimum = nums[0];
        int answer = maximum;

        for (int i = 1; i < len; i++) {
            const int cur = nums[i];

            int tempMaximum = max(cur, max(cur * maximum, cur * minimum));
            minimum = min(cur, min(cur * maximum, cur * minimum));
            maximum = tempMaximum;

            answer = max(answer, maximum);
        }

        return answer;
    }
};