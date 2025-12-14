using namespace std;
#include<iostream>
#include<vector>
#include<algorithm>
class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        //UPI
        //understand 
        //input : sorted array
        //output : the 2 indexes of the digits and add 1 to each index when returning
        //edge cases: there are no empty arrays, and we are guaranteed a solution

        //PLAN
        //okay were going to use 2 pointers one at the left most and one that starts 1 in
        //front on the left most were going to move right fowward but if total is > target
        //we are going to move left by 1 index and move right behind it and were going to do 
        //we dont have to wait to go put of bounds becsue we are guaranteed a solution?
        //no we do how do we make sure we not go out of bounds
        //since we are guaranteed a solution there is no chance of infinite loops so 
        //whenenve right is at the last compare then move left by 1 and reset right also 

        //implement
        int left = 0;
        int right = numbers.size() - 1;

        while( right != left )
        {
            
            if( ( numbers.at(left) + numbers.at(right) ) == target)
            {
                return {left+1, right+1};
            }

            if( ( numbers.at(left) + numbers.at(right) ) < target)
            {
                left++;
            }

            if( ( numbers.at(left) + numbers.at(right) ) > target)
            {
                right--;
            }
            
        }

        return {0,0};
    }
};