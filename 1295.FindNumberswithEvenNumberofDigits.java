class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums)
        {
            int length = 0;
            int c = findlength(i,length);

            if(c % 2 == 0)
            {
                ++count;
            }
        }

        return count;
    }
   

    public int findlength(int n,  int length)
    {
        if( n < 10)
        {
            
            return ++length;
        }

        int new_n = n / 10;

        return findlength(new_n, ++length);
    }
}

//what do you think Q?
