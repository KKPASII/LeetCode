class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder("");
        int left = 0;
        int right = 0;
        int startIdx = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }

            if (left == right) {
                sb.append(s.substring(startIdx + 1, i));
                left = 0;
                right = 0;
                startIdx = i + 1;
            }
        }

        return sb.toString();
    }
}