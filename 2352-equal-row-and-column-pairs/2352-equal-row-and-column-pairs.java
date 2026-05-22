class Solution {
    public int equalPairs(int[][] grid) {
        int size = grid.length;

        String[] rowNums = new String[size];
        String[] colNums = new String[size];

        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < size; j++) {
                sb.append(grid[i][j]).append(",");;
            }
            rowNums[i] = sb.toString();
        }

        for (int j = 0; j < size; j++) {
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < size; i++) {
                sb.append(grid[i][j]).append(",");;
            }
            colNums[j] = sb.toString();
        }

        int answer = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (rowNums[i].equals(colNums[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}