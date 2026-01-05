class Solution {
    public boolean isPowerOfTwo(int n) {
        int res = check(n);
        if(Math.pow(2,res) == n)
        {
            return true;
        }
        return false;
    }

    int check(int n )
    {
        if(n <= 1)
        {
            return 0;
        }

        return 1 + check(n / 2);
    }
}