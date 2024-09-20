#include <stack>
#include <unordered_map>
class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;
        unordered_map<char,char> map;
        map['('] = ')';
        map['['] = ']';
        map['{'] = '}';

        for (char& ch : s) {
            if (map.find(ch) != map.end())
                stack.push(ch);
            else {
                if (stack.empty()) return false;

                char top = stack.top();
                if (map[top] != ch)
                    return false;
                
                stack.pop();
            }
        }
        return stack.empty();
    }
};