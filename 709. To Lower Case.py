class Solution:
    def toLowerCase(self, s: str) -> str:
        A={chr(x):chr(x+32) for x in range(65,91)}
        # a={x:chr(x) for x in range(97,123)}
        # print(A)
        for x in s:
            if x in A:
                s=s.replace(x, A[x])
        return s
