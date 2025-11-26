#include<vector>
using namespace std;

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
       //brute force
       //theyre the

        int l = nums1.size() - n;
        int i = 0;

        while(l < nums1.size())
        {
            swap(nums1[l++],nums2[i++]);
        }

       sort(nums1.begin(), nums1.end());

    }
    
};