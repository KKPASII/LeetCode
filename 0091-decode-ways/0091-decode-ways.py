class Solution:
    def numDecodings(self, s: str) -> int:
        if s[0] == '0':
            return 0
        if len(s) == 1:
            return 1

        length = len(s)
        dp = [0] * (length+1)
        dp[0] = 1
        dp[1] = 1

        for i in range(2, length+1):
            if int(s[i-1]) > 0:
                dp[i] += dp[i-1]
            
            attached_num = int(s[i-2]+s[i-1])
            if 10 <= attached_num and attached_num <= 26:
                dp[i] += dp[i-2]

        return dp[length]