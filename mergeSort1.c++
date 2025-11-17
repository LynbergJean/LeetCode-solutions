#include<iostream>
#include<vector>
#include<iterator>

using namespace std;
vector<int> merge(vector<int> l, vector<int> r)
{
    //create new vector to store the sorted array
    vector<int> result;

    //iterators to go through the vector
    vector<int>::iterator left = l.begin();
    vector<int>::iterator right = r.begin();

    while(left != l.end() && right != r.end())
    {
        if(*left < *right)
        {

            result.push_back(*left);
            ++left;

        }else{

            result.push_back(*right);
            right++;
        }

    }

    
    while(left != l.end())
    {
        result.push_back(*left);
        ++left;
    }

    while(right != r.end())
    {
        result.push_back(*right);
        ++right;
    }

    return result;
}
vector<int> mergeSort(vector<int> arr)
{
    if(arr.size() == 1)
    {
        return arr;
    }

    //find the midpoint in the arr
    int mid = arr.size() / 2;

    vector<int> left(arr.begin(),mid + arr.begin() );
    vector<int> right(arr.begin() + mid, arr.end());

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left,right);

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