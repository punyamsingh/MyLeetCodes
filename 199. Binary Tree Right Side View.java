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
    List<Integer> l = new ArrayList<>();
    Map<Integer, List<Integer>> LO = new HashMap<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root==null) return new ArrayList<>();
        
        LO.put(0, new ArrayList<>(Arrays.asList(root.val)));
        helper(root, 0);

        for (Map.Entry<Integer, List<Integer>> entry : LO.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> value = entry.getValue();
            int p=LO.get(key).size()-1;
            if (p!=-1) l.add(value.get(p));
        }

        return l;
    }

    public void helper(TreeNode root, int height){
        if (root==null) return;
        List<Integer> temp = LO.getOrDefault(height+1, new ArrayList<>());
        if (root.left!=null) temp.add(root.left.val);
        if (root.right!=null) temp.add(root.right.val);
        LO.put(height+1, temp);
        helper(root.left, height+1);
        helper(root.right, height+1);
    }
}
