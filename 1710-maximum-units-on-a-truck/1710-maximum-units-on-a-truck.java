class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

        int answer = 0;

        for (int i = 0; i < boxTypes.length; i++) {
            int boxCount = Math.min(boxTypes[i][0], truckSize);

            answer += boxCount * boxTypes[i][1];
            truckSize -= boxCount;

            if (truckSize == 0) {
                break;
            }
        }

        return answer;
    }
}