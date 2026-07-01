class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int answer = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    answer++;
                    bfs(grid, visited, i, j);
                }
            }
        }

        return answer;
    }

    public void bfs(char[][] grid, boolean[][] visited, int i, int j) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();

            int row = current[0];
            int col = current[1];

            for (int dir = 0; dir < 4; dir++) {
                int nextRow = row + dx[dir];
                int nextCol = col + dy[dir];

                if (nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length) {
                    continue;
                }

                if (grid[nextRow][nextCol] == '0' || visited[nextRow][nextCol] == true) {
                    continue;
                }

                visited[nextRow][nextCol] = true;
                q.offer(new int[]{nextRow, nextCol});
            }
        }
    }
}