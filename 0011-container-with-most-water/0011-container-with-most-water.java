class Solution {
    public int maxArea(int[] height) {
        int answer = 0;
        int left = 0;
        int right = height.length - 1;

        while (left <= right) {
            int shortHeight = Math.min(height[left], height[right]);
            int width = right - left;
            answer = Math.max(answer, shortHeight * width);

            if (height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return answer;
    }
}