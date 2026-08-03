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
    int answer = 0;

    public int goodNodes(TreeNode root) {

        dfs(root, Integer.MIN_VALUE);

        return answer;
    }

    public void dfs(TreeNode node, int currentMaxValue) {
        if (node == null) {
            return;
        }

        if (node.val >= currentMaxValue) {
            answer++;
        }

        currentMaxValue = Math.max(currentMaxValue, node.val);

        dfs(node.left, currentMaxValue);
        dfs(node.right, currentMaxValue);
    }
}