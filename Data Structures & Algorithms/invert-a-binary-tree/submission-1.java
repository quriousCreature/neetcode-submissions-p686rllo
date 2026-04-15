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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(queue.size() > 0 ) {
        // swap node
        TreeNode top = queue.poll();
        TreeNode temp = top.left;
        top.left = top.right;
        top.right = temp;
        
        // add child nodes
        if ( top.left != null)
            queue.offer(top.left);
        if (top.right != null)
            queue.offer(top.right);

        }



        return root;

    }
}
