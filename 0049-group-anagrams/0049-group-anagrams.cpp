class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);

        vector<vector<string>> answer;
        int strs_len = strs.size();
        unordered_map<string, vector<string>> map;

        for (const string& str : strs) {
            string sorted_str = str;
            sort(sorted_str.begin(), sorted_str.end());
            map[sorted_str].push_back(str);
        }

        for (const auto& ans : map) {
            answer.push_back(ans.second);
        }
        
        return answer;
    }
};