class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;

        long noRearrange = 0;
        for (int i = 0; i < n; i++) {
            noRearrange += Math.abs((long) arr[i] - brr[i]);
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        long rearrange = k;
        for (int i = 0; i < n; i++) {
            rearrange += Math.abs((long) arr[i] - brr[i]);
        }

        return Math.min(noRearrange, rearrange);
    }
}