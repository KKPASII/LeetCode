class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (hset.contains(nums[i])) {
                return true;
            }
            hset.add(nums[i]);
        }
        return false;
    }
}