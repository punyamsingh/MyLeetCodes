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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();
        for (int i=0; i<descriptions.length; i++){
            int[] des = descriptions[i];
            TreeNode p = map.getOrDefault(des[0], new TreeNode(des[0]));
            children.add(des[1]);
            int isLeft=des[2];
            if (isLeft==1){
                p.left=map.getOrDefault(des[1], new TreeNode(des[1]));
                map.put(des[1], p.left);
            }
            else{
                p.right=map.getOrDefault(des[1], new TreeNode(des[1]));
                map.put(des[1], p.right);
            }
            map.put(des[0], p);
        }

        int root = -1;
        for (int [] arr: descriptions) {
            if (!children.contains(arr[0])) {
                root = arr[0];
                break;
            }
        }

        return map.getOrDefault(root, null);
    }
}
