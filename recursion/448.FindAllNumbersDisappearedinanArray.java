class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] != nums[i] - 1)
            {
                swap(nums, nums[i] - 1, i);

                if(nums[i] == nums[nums[i] - 1])
                {
                    i++;
                }

            }else
            {
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] != j + 1)
            {
                result.add( j+ 1);
            }
        }
        return result;
    }

    private void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}