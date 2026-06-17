class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return tripletCount(nums1, nums2) + tripletCount(nums2, nums1);
    }

    public int tripletCount(int[] one, int[] two) {
        HashMap<Integer, Integer> freqOne = new HashMap<>();
        HashMap<Integer, Integer> freqTwo = new HashMap<>();

        for (int num : one) {
            freqOne.put(num, freqOne.getOrDefault(num, 0) + 1);
        }

        for (int num : two) {
            freqTwo.put(num, freqTwo.getOrDefault(num, 0) + 1);
        }

        HashMap<Long, Long> productCount = new HashMap<>();

        List<Integer> values = new ArrayList<>(freqTwo.keySet());

        for (int i = 0; i < values.size(); i++) {
            for (int j = i; j < values.size(); j++) {
                int a = values.get(i);
                int b = values.get(j);

                long product = (long) a * b;
                long count;

                if (a == b) {
                    long f = freqTwo.get(a);
                    count = f * (f - 1) / 2;
                } else {
                    count = (long) freqTwo.get(a) * freqTwo.get(b);
                }

                productCount.put(product, productCount.getOrDefault(product, 0L) + count);
            }
        }

        long result = 0;

        for (int num : freqOne.keySet()) {
            long square = (long) num * num;
            result += (long) freqOne.get(num) * productCount.getOrDefault(square, 0L);
        }

        return (int) result;
    }
}