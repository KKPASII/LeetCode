class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length; 
        int[] answer = new int[len*2];

        for (int i = 0; i < len*2; i++) {
            answer[i] = nums[i%len];
        }

        return answer;
    }
}