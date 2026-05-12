class Solution {
    public int countSubstrings(String s, String t) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    int left = 0;
                    int right = 0;

                    int a = i - 1;
                    int b = j - 1;

                    while (a >= 0 && b >= 0 && s.charAt(a) == t.charAt(b)) {
                        left++;
                        a--;
                        b--;
                    }

                    a = i + 1;
                    b = j + 1;

                    while (a < s.length() && b < t.length() && s.charAt(a) == t.charAt(b)) {
                        right++;
                        a++;
                        b++;
                    }

                    answer += (left + 1) * (right + 1);
                }
            }
        }

        return answer;
    }
}