class Solution {


    public int numberOfSteps(int num) {
        if(num == 0)
        {
            return 0;
        }

        if(num == 1)
        {
            return 1;
        }

        int newNum;
        //odd
        if(num % 2 == 1)
        {
            newNum = num - 1;
            
        }else{
            newNum = num / 2;
        }

        return 1 + numberOfSteps(newNum);
    }
}