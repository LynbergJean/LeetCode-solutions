class Solution:
    def longestPalindrome(self, s: str) -> int:
        if not s:
            return 0

        dict = {}

        for i in s:
            dict[i] = dict.get(i,0) + 1

        total = 0
        flag = False

        for keys,values in dict.items():
            if(values %2 == 0):
                total += values
            else:
                total += values - 1
                flag = True

        if flag:
            total += 1

        return total
