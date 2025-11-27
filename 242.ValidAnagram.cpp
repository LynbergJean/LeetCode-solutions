#include<string>
using namespace std;
class Solution {
public:
    bool isAnagram(string s, string t) {
        int seen[26] = {};
        //count all of their frequencies
        for(char x: s)
        {
            seen[x - 'a']++;
        }

        for(char c : t)
        {
            seen[c - 'a']--;
            if(seen[c - 'a'] < 0) return false;
        }
        

        for(int i : seen)
        {
            if(i != 0)
                return false;
        }

        return true;
    }
};