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
    List <Integer> inorder = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return inorder;
        it2(root);
        return inorder;
    }

    public void it(TreeNode root) {

        if(root.left != null) {
            it(root.left);
        }
        inorder.add(root.val);

        if(root.right != null ) {
            it(root.right);
        }
    }

    public void it2(TreeNode root) {
        if (root == null) return;
        
        it2(root.left);
        inorder.add(root.val); // process
        it2(root.right);
    }

}