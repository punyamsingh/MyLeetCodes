class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        # print(log2(n))
        if (n<=0):
            return False
        a=log2(n)
        return  not(a-math.trunc(a))
