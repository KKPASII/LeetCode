class Solution {
    public int equalPairs(int[][] grid) {
        int size = grid.length;
        int answer = 0;

        HashMap<String, Integer> rowMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < size; j++) {
                sb.append(grid[j][i]).append(",");                
            }
            rowMap.put(sb.toString(), rowMap.getOrDefault(sb.toString(), 0) + 1);
        }

        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 0; j < size; j++) {
                sb.append(grid[i][j]).append(",");                
            }

            Integer value = rowMap.get(sb.toString());
            if (value != null) {
                answer += value;
            }
        }

        return answer;
    }
}