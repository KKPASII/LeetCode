class Solution {
public:
    int search(vector<int>& nums, int target) {
        int left = 0, right = nums.size() - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            const int mid_num = nums[mid];
            const int left_num = nums[left];
            const int right_num = nums[right];

            if (target == mid_num) return mid;
            
            if (left_num <= mid_num) {
                if (left_num <= target && target <= mid_num)
                    right = mid - 1;
                else left = mid + 1;
                    
            }
            else if (mid_num <= right_num) {
                if (mid_num <= target && target <= right_num)
                    left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
};