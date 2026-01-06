class findIndexFromLast{
    public int find(int arr[], int target){
        
        int result = find1(arr, target, arr.length - 1);
        return result;
    }

    public int find1(int [] arr, int target, int i)
    {
        if(i == -1)
        {
            return i;
        }
        
        if(arr[i] == target)
        {
            return i;
        }

        return find1(arr, target, i - 1);
    }
}