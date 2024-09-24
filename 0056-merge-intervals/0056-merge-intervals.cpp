#include <iostream>
#include <algorithm>
#include <vector>
class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> answer;

        sort(intervals.begin(), intervals.end());
        int left = intervals[0][0], right = intervals[0][1];
        answer.push_back(intervals[0]);
        for (int i = 1; i < intervals.size(); i++) {
            // intervals[i][0]이 right보다 크면 answer.push_back(intervals[i]) 하고, left&right 초기화
            // intervals[i][0]이 right보다 작거나 같으면 넘어가기 (아래로)
            // intervals[i][1] 검사
            // intervals[i][1]이 right보다 크면 right = intervals[i][1], answer 마지막 원소 right 값 갱신
            if (right < intervals[i][0]) {
                answer.push_back(intervals[i]);
                left = intervals[i][0];
                right = intervals[i][1];
            }

            right = max(right, intervals[i][1]);
            answer.back()[1] = right;
        }

        return answer;
    }
};