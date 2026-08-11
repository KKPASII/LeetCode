class Solution {
    int answer = 0;

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size = n * 3;

        char[][] square = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square[i][j] = '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = grid[i].charAt(j);

                int x = i * 3;
                int y = j * 3;

                if (ch == '/') {
                    square[x][y + 2] = '1';
                    square[x + 1][y + 1] = '1';
                    square[x + 2][y] = '1';
                } else if (ch == '\\') {
                    square[x][y] = '1';
                    square[x + 1][y + 1] = '1';
                    square[x + 2][y + 2] = '1';
                }
            }
        }

        answer = 0;

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (square[x][y] == '0') {
                    dfs(square, x, y, size);
                    answer++;
                }
            }
        }

        return answer;
    }

    public void dfs(char[][] square, int x, int y, int n) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        if (x < 0 || x >= n || y < 0 || y >= n) {
            return;
        }

        if (square[x][y] != '0') {
            return;
        }

        square[x][y] = '2';

        for (int dir = 0; dir < 4; dir++) {
            dfs(square, x + dx[dir], y + dy[dir], n);
        }
    }
}