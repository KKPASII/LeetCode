class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);

            int hh = Integer.parseInt(time.substring(0, 2));
            int mm = Integer.parseInt(time.substring(3, 5));

            times[i] = hh * 60 + mm;
        }

        Arrays.sort(times);
  
        int minTime = Integer.MAX_VALUE;

        for (int i = 1; i < times.length; i++) {
            minTime = Math.min(minTime, times[i] - times[i-1]);
        }

        int circular = 24 * 60 - times[times.length-1] + times[0];
        minTime = Math.min(minTime, circular);

        return minTime;
    }
}