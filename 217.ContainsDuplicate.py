class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = {}

        for i in nums:
            seen[i] = seen.get(i,0)+1
            if seen[i] >= 2:
                return True

        return False