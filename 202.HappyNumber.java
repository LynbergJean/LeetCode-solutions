class Solution {

    

    public boolean isHappy(int n) {
        HashSet <Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n))
        {
            seen.add(n);

            n = getSumOfSquares(n);
        }
        
        return n == 1;
    }

    public Integer getSumOfSquares(int n)
    {

        Integer total = 0;
        while(n > 0)
        {
            int lastDigit = n % 10;
            n = n / 10;

            int squared = lastDigit * lastDigit;

            total += squared;
        }

        return total;
    }

}