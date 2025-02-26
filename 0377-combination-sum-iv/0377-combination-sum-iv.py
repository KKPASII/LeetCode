class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        dp = [0] * (target + 1)
        dp[0] = 1


        for i in range(1, target+1):
            for num in nums:
                if i >= num:
                    dp[i] += dp[i-num] # i를 만드는 방법의 개수 더하기

        return dp[target] 