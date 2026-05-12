class Solution {
    public int countSubstrings(String s, String t) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
            int diff = 0;

                for (int a = i, b = j; a < s.length() && b < t.length(); a++, b++) {
                    if (s.charAt(a) != t.charAt(b)) {
                        diff++;
                    }

                    if (diff == 1) {
                        answer++;
                    } else if (diff > 1) {
                        break;
                    }
                }
            }
        }

        return answer;
    }
}