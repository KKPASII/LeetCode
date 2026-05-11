class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int size = matrix.length;
        int[][] mm = new int[size][size];
        int[] dx = new int[]{-1, 0, 1};

        for (int row = 0; row < size; row++) {
            Arrays.fill(mm[row], Integer.MAX_VALUE);
        }

        for (int col = 0; col < size; col++) {
            mm[0][col] = matrix[0][col];
        }

        for (int row = 0; row < size - 1; row++) {
            for (int col = 0; col < size; col++) {

                for (int i = 0; i < 3; i++) {
                    int x = col + dx[i];
                    int y = row + 1;

                    if (x >= 0 && x < size) {
                        mm[y][x] = Math.min(mm[y][x], mm[row][col] + matrix[y][x]);
                    }
                }
            }
        }

        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            minimum = Math.min(minimum, mm[size - 1][i]);
        }

        return minimum;
    }
}