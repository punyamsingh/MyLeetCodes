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
    public int longestZigZag(TreeNode root) {
        return Math.max(helper(root.left, true, 0), helper(root.right, false, 0));
    }

    public int helper(TreeNode root, boolean wentLeft, int depth){
        if (root==null) return depth;
        
        if (wentLeft) return Math.max(
                depth, 
                Math.max(
                    helper(root.right, false, depth+1),
                    helper(root.left, true, 0)
                )
            );
        else return Math.max(
                depth, 
                Math.max(
                    helper(root.left, true, depth+1),
                    helper(root.right, false, 0)
                )
            );
    }   
}
