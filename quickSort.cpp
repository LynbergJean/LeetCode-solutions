#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

void quickSort(std::vector<int> & arr, int left, int right)
{
    if(left >= right)
    {
        return;
    }

    int l = left;
    int pivot = arr[right];

    for(int i = left; i <= right; i++)
    {
        if(arr[i] < pivot)
        {
            std::swap(arr[l],arr[i]);
            l++;
        }
    }

    std::swap(arr[right],arr[l]);

    quickSort(arr,left,l-1);
    quickSort(arr,l+1,right);


}

int main() {
    std::vector<int> v = {5, 2, 9, 1, 7, 3};

    quickSort(v, 0, v.size() - 1);

    for (int x : v) std::cout << x << " ";
}
