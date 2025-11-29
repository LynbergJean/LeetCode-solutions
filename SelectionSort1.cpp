#include<iostream>
#include<vector>

using namespace std;
void SelectionSort(vector<int>& arr)
{
	if(arr.size() == 1)
		return;
	
	int i = 0;

	while(i < arr.size())
	{
		int Min = i;

		for(int j = i + 1; j < arr.size(); j++)
		{
			if(arr[j] <  arr[Min])
				Min = j;
		}
		
		
		int temp = arr[i];
		arr[i] = arr[Min];
		arr[Min] = temp;
		i++;
	}
}



int main()
{
	vector<int> s = {5,1,7,3,8,4,2,3,9,2,1,3};
	for (int i : s)
	{
		cout << i << " ";
	}

	
	SelectionSort(s);
	
	cout << endl;

	for(auto i : s)
	{
		cout << i << " ";
	}

	return 0;
}
