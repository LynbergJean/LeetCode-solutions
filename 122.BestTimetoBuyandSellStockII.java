class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;

        int largest = 0;

        while(i < prices.length && j < prices.length)
        {
            int difference = prices[j] - prices[i];

            if(difference > 0)
            {
                largest += difference;
            }

            i++;
            j++;
        }
        return largest;
    }
}