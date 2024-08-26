/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> l;

    public List<Integer> postorder(Node root) {
        l = new ArrayList<>();
        traversal(root);
        if (root!=null) l.add(root.val);
        return l;
    }

    public void traversal(Node root){
        if (root==null) return;

        for (Node n: root.children){
            traversal(n);
            l.add(n.val);
        }
    }
}
