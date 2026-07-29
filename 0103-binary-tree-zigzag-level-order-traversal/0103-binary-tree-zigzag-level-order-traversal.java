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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();

        if (root == null) {
            return answer;
        }

        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.offer(root);

        boolean leftToRight = true;

        while(!dq.isEmpty()) {
            int nodeSize = dq.size();
            // deque를 queue 처럼 쓰려면 first in first out => offerLast() && pollFirst()
            // 자료를 reverse하고 싶다면 first in last out => offerFirst() && pollFirst()

            Deque<Integer> currentDepth = new ArrayDeque<>();
            
            // 읽을 때 지그재그로 나머지는 FIFO
            for (int i = 0; i < nodeSize; i++) {
                TreeNode current = dq.pollFirst();

                if (leftToRight) {
                    currentDepth.offerLast(current.val);
                }
                else {
                    currentDepth.offerFirst(current.val);
                }

                if (current.left != null) {
                    dq.offerLast(current.left);
                }

                if (current.right != null) {
                    dq.offerLast(current.right);
                }
            }

            answer.add(new ArrayList(currentDepth));
            leftToRight = !leftToRight;
        }

        return answer;
    }
}