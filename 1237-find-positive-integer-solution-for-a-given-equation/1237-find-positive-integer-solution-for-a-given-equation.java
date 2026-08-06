/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> answer = new ArrayList<>();

        int left = 1;
        int right = 1000;

        while (left <= 1000 && right > 0) {
            if (customfunction.f(left, right) == z) {
                answer.add(Arrays.asList(left, right));
                left++;
                right--;
            }
            else if (customfunction.f(left, right) < z) {
                left++;
            }
            else {
                right--;
            }
        }

        return answer;
    }
}