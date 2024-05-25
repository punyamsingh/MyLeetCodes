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
    public int pathSum(TreeNode root, int targetSum) {
        if (root==null) return 0;
        return pathSum(root.left, targetSum)+pathSum(root.right, targetSum)+pathSumHelper(root, (long)targetSum);
    }

    private int pathSumHelper(TreeNode root, long targetSum) {
        if (root == null) return 0;
        int val = pathSumHelper(root.left, targetSum-root.val)+pathSumHelper(root.right, targetSum-root.val);
        if (root.val==targetSum) return 1+val;
        else return val;

    }
}
