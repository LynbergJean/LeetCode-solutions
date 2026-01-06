class linearSearch{
    public boolean find(int arr[], int n, int i)
    {
        
        if(i == arr.length)
        {
            return false;
        }

        return arr[i] == n || find(arr,n, i + 1);
    }
}