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
    List<Integer> pre = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        pre(root);
        return pre;
    }

    void pre(TreeNode root) {
        if(root == null) return;
        
        pre.add(root.val);
        pre(root.left);
        pre(root.right);
    }
}