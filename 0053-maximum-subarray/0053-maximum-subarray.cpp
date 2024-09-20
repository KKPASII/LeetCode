class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int size = nums.size();
        vector<int> sums(size);
        int largest_sum =  sums[0] = nums[0];
        for (int i = 1; i < size; i++) {
            largest_sum = max(largest_sum, sums[i] = max(nums[i], sums[i-1] + nums[i]));
        }
        return largest_sum;
    }
};