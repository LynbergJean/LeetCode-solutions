#include<iostream>
#include<vector>

using namespace std;

int binarySearch(vector<int> & arr,const int& left ,const int& right, 
int target)
{
	if(left > right) return -1;

	int mid = left + (right - left) / 2;

	if(left <= right)
	{
		if(arr[mid] == target)
		{
			return mid;
		}else if(target < arr[mid])
		{
			return binarySearch(arr,left,mid - 1, target);
		}else{
			return binarySearch(arr,mid+1,right, target);
		}
	}
}
