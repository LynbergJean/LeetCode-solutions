# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
        #addd every node to the
        if not root:
            return []

        queue = deque([root])
        result = []
        while queue:
            size = len(queue)
            temp_result = []

            for _ in range(size):
                #remove the first 
                temp = queue.popleft()

                if temp.left:
                    queue.append(temp.left)

                if temp.right:
                    queue.append(temp.right)

                temp_result.append(temp.val)
            
            result.append(temp_result)

        result.reverse()

        return result

