class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if(nums.length == 1)
        {
            return result;
        }

        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] != i + 1)
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

        for(int j = 0; j < nums.length; j++)
        {
            if(j + 1 != nums[j])
            {
                result.add(nums[j]);
            }
        }

        return result;

    }

    public void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}