class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size()-1;
        int max_water = 0;
        int w, h;
        while (left < right) {
            w = right - left;
            h = min(height[left], height[right]);
            int water = w * h;

            max_water = max(max_water, water);

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return max_water;
    }
};