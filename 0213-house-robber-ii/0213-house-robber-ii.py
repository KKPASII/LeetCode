class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]

        def robber1(nums: List[int]) -> int:
            if len(nums) == 1:
                return nums[0]

            prev2, prev1 = 0, nums[0]
            for i in range(1, len(nums)):
                current = max(prev1, prev2 + nums[i])
                prev2, prev1 = prev1, current
            return prev1

        case1 = robber1(nums[:-1])
        case2 = robber1(nums[1:])
        
        return max(case1, case2) 