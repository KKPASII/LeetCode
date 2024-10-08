#include <iostream>
#include <map>
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> m;
        for (int i = 0; i < nums.size(); i++) {
            int diff = target - nums[i];
            if (m.find(diff) != m.end())
                return {m[diff], i};
            else
                m[nums[i]] = i;
        }
        return {};
    }
};