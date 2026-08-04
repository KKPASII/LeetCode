/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean answer = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        dfs(root, 0, targetSum);

        return answer;
    }

    public void dfs(TreeNode node, int currentSum, int targetSum) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            if (currentSum + node.val == targetSum) {
                answer = true;
                return;
            }
        }

        dfs(node.left, currentSum + node.val, targetSum);
        dfs(node.right, currentSum + node.val, targetSum);
    }
}