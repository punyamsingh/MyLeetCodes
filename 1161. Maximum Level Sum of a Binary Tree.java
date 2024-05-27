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
    // List<Integer> l = new ArrayList<>();
    Map<Integer, Integer> LO = new HashMap<>();

    public int maxLevelSum(TreeNode root) {
        if (root==null) return 0;

        LO.put(1, root.val);
        helper(root, 1);

        int ans=1;
        int ansv=root.val;
        for (Map.Entry<Integer, Integer> entry : LO.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value>ansv){
                ansv=value;
                ans=key;
            }
        }

        return ans;
    }

    public void helper(TreeNode root, int height){
        if (root==null || (root.left==null && root.right==null)) return;
        int tempv = LO.getOrDefault(height+1, 0);
        if (root.left!=null) tempv+=(root.left.val);
        if (root.right!=null) tempv+=(root.right.val);
        LO.put(height+1, tempv);
        helper(root.left, height+1);
        helper(root.right, height+1);
    }
}
