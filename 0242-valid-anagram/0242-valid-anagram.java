class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            int cnt = map.getOrDefault(c, 0);
            if (cnt == 0) {
                return false;
            }
            map.put(c, cnt - 1);
        }
        return false;
    }
}