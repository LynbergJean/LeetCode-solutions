class Solution {
    public boolean isPowerOfThree(int n) {
        int res = check(n);
        if(Math.pow(3,res) == n)
            return true;

        return false;
    }


    int check(int n)
    {
        if(n < 3)
        {
            return 0;
        }

        if(n == 3)
        {
            return 1;
        }

        return 1 + check(n / 3);


    }
}