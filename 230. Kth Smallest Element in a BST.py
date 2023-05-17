# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        
        def inorder(root):
            L=[]
            if (root.left!=None):
                L += inorder(root.left)
            L.append(root.val)
            if (root.right!=None):
                L += inorder(root.right)
            return L

        # print(inorder(root))
        # print(inorder(root)[k])
        # while (root.left != None):
        #     root = root.left
        return inorder(root)[k-1]
