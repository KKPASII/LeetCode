class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 0;

        for (String word : words) {
            if (word.length() >= k) {
                String prefix = word.substring(0, k);
                map.put(prefix, map.getOrDefault(prefix, 0) + 1);
            }
        }
        
        for (int cnt : map.values()) {
            if (cnt > 1) {
                answer++;
            }
        }

        return answer;
    }
}