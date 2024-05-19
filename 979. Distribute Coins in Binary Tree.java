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
    int res = 0;
    
    public int distributeCoins(TreeNode root) {
        inorder(root);
        return res;
    }

    public int inorder(TreeNode root) {
        if (root == null) return 0;
        
        int l = inorder(root.left);
        int r = inorder(root.right);
        res += Math.abs(l) + Math.abs(r);

        return num_of_coins(root) - size(root);
    }

    public int num_of_coins(TreeNode root) {
        if (root == null) return 0;
        return root.val + num_of_coins(root.left) + num_of_coins(root.right);
    }

    public int size(TreeNode root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
}
