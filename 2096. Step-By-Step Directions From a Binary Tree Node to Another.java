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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder startPath=dfs(root, new StringBuilder(), startValue);
        StringBuilder destPath=dfs(root, new StringBuilder(), destValue);

        int i=0;
        while (i<Math.min(startPath.length(), destPath.length())){
            if (startPath.charAt(i)!=destPath.charAt(i)) break;
            i++;
        }

        String ans="";
        StringBuilder s = new StringBuilder();
        for (int x=i; x<startPath.length(); x++) s.append("U");

        for (int x=i; x<destPath.length(); x++) s.append(destPath.charAt(x));

        return s.toString();
    }

    public StringBuilder dfs(TreeNode root, StringBuilder path, int x){
        if (root==null) return new StringBuilder();
        if (root.val==x) return path;

        path.append("L");
        StringBuilder leftString = dfs(root.left, path, x);
        if (leftString.length()>0) return leftString;
        path.deleteCharAt(path.length() - 1);

        path.append("R");
        StringBuilder rightString = dfs(root.right, path, x);
        if (rightString.length()>0) return rightString;
        path.deleteCharAt(path.length() - 1);


        return new StringBuilder();
        
    }
}
