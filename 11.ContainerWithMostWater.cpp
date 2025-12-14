#include<vector>
#include<string>
#include<algorithm>
using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        // we need the max height of the 2 we can use the max function for this
        //we need to substract the 2 indexes and multiply them by the max and store that 
        //and continuously update the stored value

        //Input 
            //the aray is not sorted there are no intervals to keep track of 
            //we dont just need to find a subarray we need to keep going until left is 
            //at end?

        //ouput : the max value multiplied 

        //edge cases there are no empty vectors being given
        //and there are no vector with 1 eleemt inside them

        //plan
        /* we can use 2 pointers and a variable to store the max value we got so far
            left and right, 
            have left start at 0 and right at 1
            how to stop loop from going out of bounds?
            if left is at end then we return the max stored var we had 
            my algo might end up O(n2( because of compiring every 2 pairs in teh array
            how do i potimize that?
            we can start at opposite ends to minimize the time complexity and go from there
            nevrmind having right start at 1
            
            now how to use max in c++
            max returns a value so we need a variable to catch that 
            we can use std::max(a,b) to compare 2 values 
            
            and mulitply and update the global max if it is bigger thant eh current max
            //and if left and right pointer meet then we end the algo
            */

            int globalMax = -1;
            int left = 0; 
            int right = height.size() - 1;

            while(left != right)
            {
                int width = right - left;
                int tempHeight = std::min(height.at(left),height.at(right));
                int tempMax = width * tempHeight;
                globalMax = std::max(globalMax,tempMax);

                //now how to decement or increment since its now sorted
                //its not sorted how do i know the way im moving is the right one
                if(height[left] < height[right])
                {
                    //then left is limiting us
                    //move left foward
                    left++;
                }else{
                    right--;
                    //becasuse rignt is limiting us
                }
            }


            return globalMax;
    }
};