class Solution {
    public int diagonalSum(int[][] mat) {
        int answer = 0;
        for (int i = 0; i < mat.length; i++) {
            answer += mat[i][i];
            answer += mat[i][mat.length - 1 - i];
        }

        if (mat.length % 2 == 1) {
            answer -= mat[mat.length/2][mat.length/2];
        }

        return answer;
    }
}