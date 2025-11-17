#include<iostream>
#include<vector>
#include<iterator>

using namespace std;

vector<int> merge(vector<int>& left, vector<int>& right)
{
    //new vector to store the result
    vector<int> result;

    //iterartors
    vector<int>::iterator l, r;
    l = left.begin();
    r = right.begin();

    while(l != left.end() && r != right.end())
    {
        if(*l < *r)
        {
            result.push_back(*l);
            ++l;
        }else{
            result.push_back(*r);
            ++r;
        }
    }

    while(l != left.end())
    {
        result.push_back(*l);
        ++l;
    }

    while(r != right.end())
    {
        result.push_back(*r);
        ++r;
    }

    return result;

}

vector<int> mergeSort(vector<int>& arr)
{
    //if array has 1 element return it 
    if(arr.size() <= 1)
    {
        return arr;
    }

    //else do what
    //find mid
    int mid = arr.size() / 2;

    //create 2 subarrays
    vector<int> left(arr.begin(), arr.begin() + mid);
    vector<int> right(arr.begin() + mid, arr.end());

    //recursively break the arrays down till there are one element left 
    //in them and send them to be merged
    vector<int> l = mergeSort(left);
    vector<int> r = mergeSort(right);

    return merge(l, r);
}
int main()
{
    std::vector<int> arr = {2,3,5,6,4,3,5,3,5,74,2,1,3,5,2,2,};
    std::vector<int> result = mergeSort(arr);

    for(int i : result){
        std::cout << i << std::endl;
    }
    return 0;
}