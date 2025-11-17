#include<iostream>
#include<vector>
#include<iterator>

bool sorted(std::vector<int>& passed)
{
    for(std::vector<int>::iterator it = passed.begin(); it != passed.end();)
    {   
        //temp
        std::vector<int>::iterator temp = it;
        ++temp;

        if(temp == passed.end())
        {return true;}
        if(*it > *temp )
        {return false;}

        ++it;
    }
    return true;
}

bool helper(std::vector<int> & passed,const int & left ,const int & left + 1);
bool recursive(std::vector<int>& passed)
{
    int left = 0;
    int right = passed.size() - 1;

    bool k = helper(passed,left , left + 1);
    if(k == 0)
    {
        return false;
    }
}

int main()
{
    std::vector<int> a = {1,1,3,3,4,5,2};
    bool k = recursive(a);
    std::cout << k;
}