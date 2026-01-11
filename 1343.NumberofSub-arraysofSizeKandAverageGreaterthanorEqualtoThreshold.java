class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        /* 
        UPI 
        inputs:
        the array will never be empty
        k is never 0
        the treshold can be 0
        
        output
        the total number of windows >= to the treshhol
        
        edge cases
        np edge case jumps out to be immediatly

        plan 

        we need tp check add all the current elements to the total and calutalte the avarage and weregoing to do this continuously and we will return the total number of sub arrays that are greater than or equal to the treshold
        */
        int result = 0;
        int total = 0;

        for(int i = 0; i < k; i++)
        {
            total += arr[i];
        }

        if( (total / k ) >= threshold)
        {
            result++;
        }

        int right = k;
        int left = 1;
        while(right < arr.length)
        {
            total -= arr[left - 1];
            total += arr[right];

            if((total / k) >= threshold)
            {
                result++;
            }

            right++;
            left ++;
        }

        return result;
    }
}