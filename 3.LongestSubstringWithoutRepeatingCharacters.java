class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();

        int left = 0;
        int right = 0;

        int longest = 0;

        while( left < s.length() && right < s.length())
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                longest = Math.max(right - left + 1, longest);
                right++;
            }else{
                set.remove(s.charAt(left));
                left++;
               
            }
        }

        return longest;
    }
}