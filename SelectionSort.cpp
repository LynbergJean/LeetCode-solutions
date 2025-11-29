#include<iostream>
#include<vector>

using namespace std;

void swap(vector<int> &arr, int large, int end)
{
	int temp = arr[large];
	arr[large] = arr[end];
	arr[end] = temp;
}

//will pass the whole size of the array i need to pass the end it needs to look at
int find_largest(vector<int>& arr, int end)
{
	int largest = arr[0];
	int index = 0;
	for(int i = 1; i <= end; i++)
	{
		if(arr[i] > largest)
		{
			largest = arr[i];
			index = i;
		}
	}

	return index;
}


void SelectionSort(vector<int>& arr, int end)
{
	//lets implement it by largest
	//base case 
	if(end == 0)
	{
		return;
	}

	int index = find_largest(arr, end);
	swap(arr, index, end);

	SelectionSort(arr, end - 1);
	
}
int main(){
	
	vector<int> s = {7,4,2,4,9,8,64,32,244,2,1,0,64,2,3,5,67,3,13};
	for(auto i: s)
	{
		cout << i << " ";
	}
	
	cout << endl;
	
	//sort the array
	SelectionSort(s,s.size() - 1);

	for(auto i: s)
	{
		cout << i << " ";
	}


	return 0;
}
