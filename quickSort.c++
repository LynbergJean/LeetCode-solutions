#include<iostream>
using namespace std;

void quickSort(const int & arr[], const int & left, const int & right)
{
    if(left >= right)
        return;

    int s = left;
    int e = right; 
    int middle = s + (e - s);

    int pivot = arr[middle];

    while(s <= e)
    {
        while(arr[s] < pivot)
        {
            
        }
    }

}