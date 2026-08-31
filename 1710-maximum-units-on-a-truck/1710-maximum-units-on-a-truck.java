class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int answer = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            int count = Math.min(boxTypes[i][0], truckSize);

            answer += count * boxTypes[i][1];
            truckSize -= count;

            if (truckSize == 0) {
                break;
            }
        }

        return answer;
    }
}