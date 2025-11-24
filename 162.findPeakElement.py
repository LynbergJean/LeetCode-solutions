class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        i = 0
        for i in range(len(nums)):
            #deal with the first element
            if i == 0 and len(nums) == 1:
                return i

            elif i == len(nums) - 1 and nums[i] > nums[i - 1]:
                return i

            elif nums[i] > nums[i + 1] and nums[i] > nums[i - 1]:
                return i