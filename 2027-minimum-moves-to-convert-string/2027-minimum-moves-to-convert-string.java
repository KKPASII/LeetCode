class Solution {
    public int minimumMoves(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                int remain = Math.min(2, s.length() - i - 1);
                answer++;
                i += remain;
            }
        }

        return answer;
    }
}