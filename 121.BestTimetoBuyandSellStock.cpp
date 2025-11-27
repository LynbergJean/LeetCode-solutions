using namespace std;
#include<iostream>
#include<vector>
#include<algorithm>
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit = 0;
        int minprice = prices[0];

        for(int i : prices)
        {
            minprice = min(minprice,i);
            profit = max(profit,i - minprice);
        }

        return profit;
    }
};