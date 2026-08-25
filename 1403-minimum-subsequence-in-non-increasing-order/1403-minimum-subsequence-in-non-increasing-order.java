class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        int[] sortedRevNums = nums.clone();
        Arrays.sort(sortedRevNums);

        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int sum = 0;
        int index = nums.length - 1;
        while (sum <= totalSum - sum) {
            sum += sortedRevNums[index];
            answer.add(sortedRevNums[index]);
            index--;
        }

        return answer;
    }
}