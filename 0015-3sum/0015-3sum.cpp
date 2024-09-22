#include <unordered_map>
#include <algorithm>
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int size = nums.size();
        vector<vector<int>> answer;
        for (int i = 0; i < size-2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int left = i+1;
            int right = size-1;
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if (total < 0)
                    left += 1;
                else if (total > 0)
                    right -= 1;
                else {
                    vector<int> triplet = {nums[i], nums[left], nums[right]};
                    answer.push_back(triplet);
                    while (left < right && nums[left] == triplet[1])
                        left += 1;
                    while (left < right && nums[right] == triplet[2])
                        right -= 1;
                }
            }
        }

        return answer; 
    }
};