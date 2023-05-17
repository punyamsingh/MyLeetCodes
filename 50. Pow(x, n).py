import sys

# Set this to whatever you want the limit to be
# n = 100
class Solution:
    # sys.setrecursionlimit(2147483647)
    def myPow(self, x: float, n: int) -> float:
        return pow(x,n)
        # def pow(x,k,n):
        #     m=sys.setrecursionlimit()
        #     if (n==0):
        #         return 1
        #     elif (n<0):
        #         return (1/pow(x,-n,n))
        #     else:
        #         if (k==1):
        #             return x
        #         elif (k==2):
        #             return x**2
        #         elif (k==3):
        #             return x**3
        #         return (x**3)*pow(x,k-3,n)
        # # else:
        # #     return pow(x,n,n)
