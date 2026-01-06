class isSorted{
    public boolean isSorted(int [] arr, int i)
    {
        if(i == arr.length - 1)
            return true;

        return (arr[i] <= arr[i+1]) && isSorted(arr, i+1);
    }
}