class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right = 0;

        int consec = 0;
        
        int temp = 0;
        while(right < nums.length)
        {
            if(nums[right] == 1)
            {
                temp++;
            }else{
                temp = 0;
            }

            consec = Math.max(temp, consec);
            right++;
        }

        return consec;
    }
}