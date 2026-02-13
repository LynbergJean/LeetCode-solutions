class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        while(i < nums.length)
        {
            if(nums[i] - 1!= i )
            {
                swap(nums, nums[i] - 1, i);

                if(nums[i] == nums[nums[i] - 1])
                {
                    i++;
                }
            }else{
                i++;
            }
        }

        int [] arr = new int [2];
        int k = 0;
        for(int j = 0; j < nums.length; j++)
        {
            if(j + 1 != nums[j])
            {
                arr[k++] = nums[j];
                arr[k] = j + 1;
                break;
            }
        }

        return arr;
    }

    public void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}