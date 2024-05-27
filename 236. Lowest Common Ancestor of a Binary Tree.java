/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lcaHelper(root, p, q, root);
    }

    public TreeNode lcaHelper(TreeNode root, TreeNode p, TreeNode q, TreeNode curLCA){
        if (root==null) return curLCA;
        boolean lp = isDescendant(root.left, p);
        boolean lq = isDescendant(root.left, q);
        boolean rp = isDescendant(root.right, p);
        boolean rq = isDescendant(root.right, q);

        if ((lp && rq) || (lq && rp)){
            curLCA = root;
            return root;
        }
        else if (lp && lq){
            return lcaHelper(root.left, p, q, curLCA);
        }
        else if (rp && rq){
            return lcaHelper(root.right, p, q, curLCA);
        }
        return root;

    }

    public boolean isDescendant(TreeNode root, TreeNode r){
        if (root==null) return false;
        if (root==r) return true;
        return (isDescendant(root.left, r) || isDescendant(root.right, r));
    }
}
