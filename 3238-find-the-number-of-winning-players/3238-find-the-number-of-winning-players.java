class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] cnt = new int[n][11];

        for (int[] pb : pick) {
            int player = pb[0];
            int ball = pb[1];

            cnt[player][ball]++;
        }

        int answer = 0;
        
        for (int p = 0; p < n; p++) {
            for (int b = 0; b <= 10; b++) {
                if (cnt[p][b] > p) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}