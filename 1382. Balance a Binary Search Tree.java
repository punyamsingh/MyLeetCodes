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
    PriorityQueue<TreeNode> pq;
    List<TreeNode> result;
    public TreeNode balanceBST(TreeNode root) {
        pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        traversal(root);

        result = new ArrayList<>(pq.size());
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }



        return sortedArrayToBST(0, result.size()-1);

    }

    TreeNode sortedArrayToBST(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = result.get(mid);
        root.left = sortedArrayToBST(start, mid - 1);
        root.right = sortedArrayToBST(mid + 1, end);
        return root;
    }

    public void traversal(TreeNode root){
        if (root==null) return;
        traversal(root.left);
        pq.add(root);
        traversal(root.right);
    }
}
