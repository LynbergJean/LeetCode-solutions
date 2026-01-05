
class sumTriangle{
    public static void main(String[] args) {

        int [] num = {1,2,3,4,5};
        //sum(num);

        late(5);

        int k = multi(5);
        System.out.println(k);

        int s = sumOfDigits(1342);
        System.out.println(s);

        int p = productOfDigits(1342);
        System.out.println(p);


        int r = reverseNum(1342);
        System.out.println(k);
    }

    static void sum(int [] nums)
    {
        if(nums.length == 1)
        {
            System.out.println(nums[0]);
            return;
        }

        //we want to print the actual array last and the totals firat
        //how can i do it e
    }

    static void late(int n )
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }

        late(n - 1);
        System.out.println(n);


    }

    static int multi(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n * multi(n - 1);
    }

    static int sumOfDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }

        return n % 10 + sumOfDigits(n /10);
    }

    static  int productOfDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }

        return n % 10 * productOfDigits( n / 10);

    }

    static int reverseNum(int n)
    {
        
    }
}