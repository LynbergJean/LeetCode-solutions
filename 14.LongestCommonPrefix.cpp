#include<vector>
#include<string>
using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {

        string prefix(strs[0].begin(), strs[0].end());

        for(int i = 1; i < strs.size(); i++)
        {
            int j = 0;
            int size = strs[i].size();

            while(j < prefix.size() && j < strs[i].size() && strs[i][j] == prefix[j])
            {
                j++;
            }
            prefix = strs[i].substr(0,j);

            if(prefix.size() == 0)
            {
                return "";
            }
        }

        return prefix;
       
    }
};