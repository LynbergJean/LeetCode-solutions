class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict1 = {}

        for index,value in enumerate(nums):
            result = target - value 
            if result in dict1:
                return [index,dict1[result]]
            else:
                dict1[value] = index
            
                