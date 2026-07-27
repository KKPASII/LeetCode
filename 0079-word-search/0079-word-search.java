class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, visited, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, boolean[][] visited, String word, int x, int y, int idx) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        if (visited[x][y]) {
            return false;
        }

        if (board[x][y] != word.charAt(idx)) {
            return false;
        }

        if (idx == word.length() - 1) {
            return true;
        }

        visited[x][y] = true;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < board.length && ny >= 0 && ny < board[0].length) {
                if (dfs(board, visited, word, nx, ny, idx + 1)) {
                    return true;
                }
            }
        }

        visited[x][y] = false;

        return false;
    }
}