class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> answer = new ArrayList<>();
        int i = 0;
        int len = intervals.length;

        while (i < len && intervals[i][1] < newInterval[0]) {
            answer.add(intervals[i]);
            i++;
        }

        int[] mergedInterval = new int[]{newInterval[0], newInterval[1]};
        while (i < len && intervals[i][0] <= mergedInterval[1]) {
            mergedInterval[0] = Math.min(intervals[i][0], mergedInterval[0]);
            mergedInterval[1] = Math.max(intervals[i][1], mergedInterval[1]);
            i++;
        }

        answer.add(mergedInterval);

        while (i < len) {
            answer.add(intervals[i]);
            i++;
        }

        return answer.toArray(new int[answer.size()][]);
    }
}