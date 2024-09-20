class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int size = nums.size();
        vector<int> answer(size, 1);
        
        for (int i = 1; i < size; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }

        int right = nums[size-1];
        for (int i = size-2; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }
};