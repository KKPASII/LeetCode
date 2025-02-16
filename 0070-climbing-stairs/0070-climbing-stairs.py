class Solution:
    def climbStairs(self, n: int) -> int:
        if (n == 1):
            return 1

        first = 1
        second = 1
        answer = 0

        for i in range(2, n+1):
            answer = first + second # 3 2  
            second = first
            first = answer
        
        return answer