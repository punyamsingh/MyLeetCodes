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
class BSTIterator {
    TreeNode root;
    List<Integer> list;
    private int i;

    public BSTIterator(TreeNode root) {
        this.root=root;
        list =  new ArrayList<>();
        iterate(root);
        i=0;
    }
    
    private void iterate(TreeNode root){
        if(root.left != null){
            iterate(root.left);
        }

        list.add(root.val);

        if(root.right != null){
            iterate(root.right);
        }
    }

    public int next() {
        return list.get(i++);
    }
    
    public boolean hasNext() {
        return i != list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
