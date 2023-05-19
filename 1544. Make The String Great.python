class Solution(object):
    def makeGood(self, s):
        """
        :type s: str
        :rtype: str
        """

        x=[]
        for i in s:
            if x==[]:
                x.append(i)
                continue
            if (x[-1].isupper() ^ i.isupper()):
                if (x[-1].upper()==i.upper()):
                    x.pop()
                    continue
            x.append(i)
        return "".join(e for e in x)
