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
        TreeNode new_left = null;
        TreeNode new_right = null;
        if (root.left != null ) {
            new_right = invertTree(root.left);
        }
        if (root.right != null ) {
            new_left = invertTree(root.right);
        }

        root.left = new_left;
        root.right = new_right;

        return root;

    }
}
