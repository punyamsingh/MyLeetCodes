class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        for x in range(len(s)//2):
            # print(s[x])
            # print(s[-(x+1)])
            s[x],s[-(x+1)] = s[-(x+1)],s[x]
