class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        L1=list(pattern)
        L2=s.split(" ")
        a=len(L1)
        b=len(L2)
        
        if (a!=b):
            return False
        D=dict()
        for x in range(a):
            print(L1[x], L2[x])
            # L2[x] in D.values()
            if (L1[x] in D):
                if (D[L1[x]]!=L2[x]):
                    return False
                continue
            elif (L2[x] in D.values()):
                return False
            D[L1[x]]=L2[x]
        
        return True
        
