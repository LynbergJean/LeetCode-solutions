class Solution {
    public boolean isPowerOfFour(int n) {
        int res = check(n);
        if(Math.pow(4,res) == n)
            return true;

        return false;
    }


    int check(int n)
    {
        if(n < 4)
        {
            return 0;
        }

        if(n == 4)
        {
            return 1;
        }

        return 1 + check(n / 4);


    
    }
}