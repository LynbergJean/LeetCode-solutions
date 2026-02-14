class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #how does it worK
        #since max can be 0 were going to set max to the first num
        #why have cursum be 0 because were doing addition and for that we need to add to 0 
        #if after adding to the cursum the new cursum is less than 0 then reset cursum to 0 so we can recount again after that add to 0 so we dont accidentally take the max of cur sum as cursum is 0 we mgihg be given an array fro all neg interger in that case we need to find the larget interview 
        #take max
        Max = nums[0]
        curSum = 0
        for right in  nums:
            if curSum < 0:
                curSum = 0
            curSum += right
            Max = max(Max,curSum)

            


        return Max