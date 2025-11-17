# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution:
    def isSymmetric(self, root) -> bool:
        if not root:
            return False

        queue = deque([root])
        temp = queue.popleft()
        #add the left and right node

        queue.append(temp.left)
        queue.append(temp.right)

        while queue:
            t1 = queue.popleft()
            t2 = queue.popleft()

            if t1 == None and t2 == None:
                continue

            if t1 == None or t2 == None:
                return False

            if t1.val != t2.val:
                return False

            queue.append(t1.left)
            queue.append(t2.right)
            queue.append(t1.right)
            queue.append(t2.left)
        
        return True
