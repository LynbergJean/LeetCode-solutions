#include<unordered_map>
#include<string>
using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char, int> map;
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;

        int total = 0;
        int i = 0;
        while(i < s.size())
        {
            if(i != s.size() - 1){

                //meaning it is not the last character and we can check the next charater
                if(map[s[i]] < map[s[i + 1]])
                {
                    total -= map[s[i]];
                }else{
                    total += map[s[i]];
                }

            }else{
                total += map[s[i]];
            }

            i++;

        }
        return total;
    }
};