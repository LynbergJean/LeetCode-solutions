class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] != i + 1)
            {
                swap(nums, nums[i] - 1, i);

                if(nums[i] == nums[nums[i] -  1])
                {
                    i++;
                }
            }else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++)
        {
            if(j + 1 != nums[j])
            {
                return nums[j];
            }
        }
        return 0;

    }

    public void swap(int [] arr, int n, int m)
    {
        int temp = arr[n];
        arr[n] = arr[m];
        arr[m] = temp;
    }
}