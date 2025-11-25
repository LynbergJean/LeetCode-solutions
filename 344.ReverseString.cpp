#include<string>
#include<vector>
using namespace std;

class Solution {
public:
    void reverseString(vector<char>& s) {
        int i = 0;
        int size = s.size() - 1;

        while(i < size)
        {
            char temp = s[i];
            s[i] = s[size];
            s[size] = temp;

            i++;
            size--;
        }

    }
};