class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] newArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int i = 0;
        int j = nums.length - 1;
        int temp = nums.length - 1;

        while(i <= j)
        {
            if(nums[i] > nums[j])
            {
                newArr[temp--] = nums[i++];
            }else{
                newArr[temp--] = nums[j--];
            }
        }

        return newArr;


    }
}