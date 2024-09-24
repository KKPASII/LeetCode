class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);

        vector<vector<string>> answer;
        int strs_len = strs.size();
        unordered_map<string, vector<string>> map;
        string str;

        for (int i = 0; i < strs_len; i++) {
            str = strs[i];
            sort(strs[i].begin(), strs[i].end());
            map[strs[i]].push_back(str);
        }

        for (auto ans : map) {
            answer.push_back(ans.second);
        }
        
        return answer;
    }
};