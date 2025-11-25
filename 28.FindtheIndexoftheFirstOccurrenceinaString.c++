#include<string>
using namespace std;

class Solution {
public:
    int strStr(string haystack, string needle) {
        if(needle.size() > haystack.size())
        {
            return -1;
        }
        
        int width = needle.size();
        int i = 0;

        while(i + width <= haystack.size())
        {
            if(haystack.substr(i,width ) == needle)
            {
                return i;
            }
            i++;
        }
        return -1;


    }
};