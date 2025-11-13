# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0

        queue = deque([root])
        depth = 1
        while queue:

            size = len(queue)

            for _ in range(size):
                temp = queue.popleft()

                if temp.left:
                    queue.append(temp.left)
                
                if temp.right:
                    queue.append(temp.right)

                if not temp.left and not temp.right:
                    return depth
                


            depth += 1
            
        return depth
            
