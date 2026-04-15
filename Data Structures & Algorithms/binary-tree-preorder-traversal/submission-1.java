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
        
        preIt(root);
        return pre;
    }

    void pre(TreeNode root) {
        if(root == null) return;

        pre.add(root.val);
        pre(root.left);
        pre(root.right);
    }

    void preIt(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();

        TreeNode curr = root;
        while( curr!= null || queue.size() > 0) {
            // process the element and add to queue
            while (curr != null ) {
                pre.add(curr.val);
                queue.offer(curr);
                curr = curr.left;
            }

            // pick the last element from stack
            curr = queue.pollLast();

            // move to right
            curr = curr.right;
            
        }
    }
}