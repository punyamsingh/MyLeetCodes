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
    public int getMinimumDifference(TreeNode root) {
        int maxAbs=Integer.MAX_VALUE;
        a = new ArrayList<Integer>();
        it(root);
        for (int i=1; i<a.size(); i++){
            maxAbs=Math.min(maxAbs, Math.abs(a.get(i)-a.get(i-1)));
        }
        return maxAbs;
    }

    void it(TreeNode root) {
        if (root!=null){
            it(root.left);
            a.add(root.val);
            it(root.right);
        }
    }
}
