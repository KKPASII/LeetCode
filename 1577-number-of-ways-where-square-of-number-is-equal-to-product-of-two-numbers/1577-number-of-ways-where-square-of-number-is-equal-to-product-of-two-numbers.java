class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return tripletCount(nums1, nums2) + tripletCount(nums2, nums1); 
    }

    public int tripletCount(int[] one, int[] two) {
        HashMap<Long, Integer> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < two.length; i++) {
            for (int j = i + 1; j < two.length; j++) {
                long production = (long) two[i] * two[j];
                map.put(production, map.getOrDefault(production, 0) + 1);
            }
        }

        for (int num : one) {
            long square = (long) num * num;
            cnt += map.getOrDefault(square, 0);
        }
        
        return cnt;
    }
}