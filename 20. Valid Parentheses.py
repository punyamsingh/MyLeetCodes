class Solution:
    def isValid(self, s: str) -> bool:
        di={'(':')', '{':'}', '[':']'}
        cur=[]
        for x in s:
            if x in di.values() and cur==[]:
                return False
            if x in di.keys():
                cur.append(x)
                continue
            elif di[cur[-1]]==x:
                s=s.replace(cur[-1]+x, "")
                # s=s.replace(x, "")
                cur.pop()
                continue
            return False
        return s==""
