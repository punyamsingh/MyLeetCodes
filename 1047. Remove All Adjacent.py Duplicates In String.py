class Solution:
    def removeDuplicates(self, s: str) -> str:
        L=[]
        for x in s:
            if L==[]:
                L.append(x)
            elif L[-1]==x:
                L.pop(-1)
            else:
                L.append(x)
        return ''.join(e for e in L)
