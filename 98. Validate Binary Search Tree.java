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
    List<Integer> a;
    public boolean isValidBST(TreeNode root) {
        a = new ArrayList<Integer>();
        it(root);
        for (int g=1; g<a.size(); g++){
            if (a.get(g) <= a.get(g-1)) return false;
        }
        return true;
    }

    void it(TreeNode root) {
        if (root!=null){
            it(root.left);
            a.add(root.val);
            it(root.right);
        }
    }
}
