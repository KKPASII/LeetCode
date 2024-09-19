class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.size() != t.size())
            return false;
        
        map<char, int> m_s;
        map<char, int> m_t;

        for (char ch : s) {
            m_s[ch]++;
        }
        for (char ch : t) {
            m_t[ch]++;
        }

        return m_t == m_s;
    }
};