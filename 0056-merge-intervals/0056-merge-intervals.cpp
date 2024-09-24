#include <iostream>
#include <algorithm>
#include <vector>
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> answer;
        sort(intervals.begin(), intervals.end());

        for (int i = 0; i < intervals.size(); i++) {
            if (answer.empty() || answer.back()[1] < intervals[i][0]) {
                answer.push_back(intervals[i]);
            }
            else {
                answer.back()[1] = max(answer.back()[1], intervals[i][1]);
            }
        }

        return answer;
    }
};