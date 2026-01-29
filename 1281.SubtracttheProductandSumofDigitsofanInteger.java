class Solution {
    int sum = 0;
    int product = 1;

    public int subtractProductAndSum(int n) {

        int result = find(n);

        return result;
    }

    public int find(int n )
    {
        //base case
        if(n < 10 )
        {
            sum += n;
            product *= n;

            return product - sum;
        }

        //else we get teh last number we add it to sum and product and decrease it and call the funcntion again
        int last = n % 10;
        sum += last;
        product *= last;

        int new_num = n / 10;

        return find(new_num);
    }
}