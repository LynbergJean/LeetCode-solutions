class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int sec = -1;
        
        for(int m = 0; m < s.length(); m++)
        {
            char c = s.charAt(m);
            if(Character.isDigit(c))
            {   
                int k = Character.getNumericValue(c);
                if(k  > largest)
                { sec = largest; largest = k; }
                if( k  > sec && k < largest)
                {
                    sec = k;
                }
            }
        }

        if(sec == largest)
        {
            return -1;
        }

        return sec;
    }
}