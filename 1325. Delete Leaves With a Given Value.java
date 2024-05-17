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
    public boolean deleteORNot(TreeNode root, int target){
        if (root==null) return false;
        if (root.left == null && root.right == null)
            return (root.val==target);
        return false;
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root==null) return null;      
        removeLeafNodes(root.left, target);
        removeLeafNodes(root.right, target);
        if (deleteORNot(root.left, target)) root.left=null;
        if (deleteORNot(root.right, target)) root.right=null;
        if (deleteORNot(root, target)) return null;
        return root;
    }
}
