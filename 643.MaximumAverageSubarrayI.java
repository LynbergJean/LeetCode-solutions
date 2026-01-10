class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double max_avg = - Double.MAX_VALUE;
        double total = 0;


        for(int i = 0; i < k; i++)
        {
            total += nums[i];
        }

        max_avg = Math.max(total/k, max_avg);
        int left = 1;
        int right = k;

        while(right < nums.length)
        {
            total += nums[right];
            total -= nums[left - 1];

            max_avg = Math.max(total/k, max_avg);
            right++;
            left++;

        }

        return max_avg;
    }
}